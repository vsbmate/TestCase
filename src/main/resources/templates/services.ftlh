<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Услуги</title>
</head>
<body>
<h1>Список услуг</h1>
<table>
    <thead>
    <tr>
        <th></th>
        <th>Название услуги</th>
        <th>Действия</th>
    </tr>
    </thead>
    <tbody>
    <#list serviceModels as serviceModel>

            <#if serviceModel.serviceName?has_content>
                <tr>
                    <td>${serviceModel.id}</td>
                    <td>${serviceModel.serviceName}</td>
                    <td>
                        <form method="post" action="/services/delete/${serviceModel.serviceName}">
                            <button type="submit">Удалить</button>
                        </form>
                    </td>
                    <td>
                        <form method="post" action="/services/delete/${serviceModel.serviceName}/force">
                            <button type="submit">Force delete</button>
                        </form>
                    </td>
                </tr>
            </#if>
            <#if serviceModel.subServiceName?has_content>
                <tr>
                    <td></td>
                    <td>${serviceModel.subServiceName}</td>
                    <td>
                        <form method="post" action="/services/delete/${serviceModel.serviceName}">
                            <button type="submit">Удалить</button>
                        </form>
                    </td>
                    <td>
                        <form method="post" action="/services/delete/${serviceModel.serviceName}/force">
                            <button type="submit">Force delete</button>
                        </form>
                    </td>
                </tr>
            </#if>
            <#if serviceModel.secondSubServiceName?has_content>
                <tr>
                    <td></td>
                    <td>${serviceModel.secondSubServiceName}</td>
                    <td>
                        <form method="post" action="/services/delete/${serviceModel.serviceName}">
                            <button type="submit">Удалить</button>
                        </form>
                    </td>
                    <td>
                        <form method="post" action="/services/delete/${serviceModel.serviceName}/force">
                            <button type="submit">Force delete</button>
                        </form>
                    </td>
                </tr>
            </#if>
        </#list>

    </tbody>
</table>
</body>
</html>