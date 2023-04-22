<!DOCTYPE html>
<#import "/spring.ftl" as spring />

<html xmlns:th="http://www.thymeleaf.org">

<head>
    <title>Создание абонента</title>
</head>
<body>

<div align="center">

    <h3>Создание абонента и выбор услуги</h3>

    <form action="/" method="post">

        ФИО: <br>
        <@spring.formInput "abonent.fio"/>
        <br><br>
        ACCOUNT: <br>
        <@spring.formInput "abonent.account"/>
        <br><br>
        Услуга: <br>
        <input type="hidden" name="service.serviceName" id="serviceName">
        <input type="hidden" name="service.subServiceName" id="subServiceName">
        <input type="hidden" name="service.secondSubServiceName" id="secondSubServiceName">
        <select name="menu" onchange="updateService(this.value)">
            <#list menu.root.subItems as item>
                <option value='{"service":"${item.name}", "subService":"", "secondSubService":""}'>${item.name}</option>
                <#list item.subItems as subItem>
                    <option value='{"service":"${item.name}", "subService":"${subItem.name}", "secondSubService":""}'>-- ${subItem.name}</option>
                    <#list subItem.subItems as secondSubItem>
                        <option value='{"service":"${item.name}", "subService":"${subItem.name}", "secondSubService":"${secondSubItem.name}"}'>
                            ---- ${secondSubItem.name}</option>
                    </#list>
                </#list>
            </#list>
        </select>

        <script type="text/javascript">
            function updateService(value) {
                var serviceName = document.getElementById("serviceName");
                var subServiceName = document.getElementById("subServiceName");
                var secondSubServiceName = document.getElementById("secondSubServiceName");
                var option = JSON.parse(value);
                serviceName.value = option.service;
                subServiceName.value = option.subService;
                secondSubServiceName.value = option.secondSubService;
            }
        </script>


        <br><br>

        <input type="submit" value="Создать"/>

        <br><br>
        <a href='/getallabonents'>Получить список всех абонентов</a>
        <br><br>
        <a href='/getallservices'>Получить список всех услуг</a>
        <br><br>
        <a href='/services'>Удаление подключенных услуг</a>
        <br><br>
        <a href='/getallabonentssortedbyaccount'>Получить список абонентов отсортированных по лицевому счету(account)</a>
        <br><br>
        <a href='/findbyparentservicename/Жилищно-коммунальные услуги'>Поиск по идентификатору услуги (Не включая дочерние)</a> По ссылке выбрано: Жилищно-коммунальные услуги
        <br><br>
        <a href='/findbysubservicename/Отопление'>Поиск по идентификатору услуги (Включая дочерние)</a> По ссылке выбрано: Отопление
        <br><br>
        <a href='/findbysecondsubservicename/Горячая вода'>Поиск по идентификатору услуги (Включая дочерние дочерних)</a> По ссылке выбрано: Горячая вода
        <br><br>
        <a href='/findbyallservicesnames/Жилищно-коммунальные услуги/Вода/Холодная вода'>Поиск по полному имени(Родительская услуга/дочерняя услуга/дочерняя дочерней)</a>
        По ссылке выбрано: Жилищно-коммунальные услуги/Вода/Холодная вода

    </form>

</div>
</body>
</html>