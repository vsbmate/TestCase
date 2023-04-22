# TestCase

URL адреса и их описание:

/getallabonents - получение списка всех абонентов и подключенных к ним услуг. Возвращает постраничный вывод информации в формате json

/getallservices - получение списка всех услуг из базы данных в формате json

/services - открывает страницу с услугами, которые подключены к абонентам. Кнопка удалить проверяет есть ли дочерние классы или пдключенные абонента 
            у удаляемой услуги. Если есть, при нажатии открывает страницу с сообщением, что удаление невозможно.
            Кнопка Force delete удаляет услугу и связанных с ней абонентов в любом случае.



/getallabonentssortedbyaccount - получение списка абонентов отсортированных по лицевому счету(account) в порядке возрастания. Возвращает постраничный вывод в формате json




/findbyparentservicename/{serviceName} -  поиск по идентификатору услуги (serviceName) не включая дочерние. Примеры для поиска:/findbyparentservicename/Жилищно-коммунальные услуги
                                                                                                                               /findbyparentservicename/Детский сад
В поиск нужно вводить только имя родительский услуги





/findbysubservicename/{subServiceName} - поиск по идентификатору услуги (subServiceName) Включая дочерние. Примеры для поиска: /findbysubservicename/Вода
                                                                                                                              /findbysubservicename/Отопление
                                                                                                                              /findbysubservicename/Ясли
В поиск нужно вводить только имя дочерней услуги





/findbysecondsubservicename/{secondSubServiceName} - поиск по идентификатору услуги (secondSubServiceName) Включая дочерние дочерних. Примеры для поиска: /findbysecondsubservicename/Горячая вода
 																									    /findbysecondsubservicename/Холодная вода
В поиск нужно вводить только имя дочерней дочерней услуги(извиняюсь за та тавтологию)





/findbyallservicesnames/{serviceName}/{subServiceName}/{secondSubServiceName} - Поиск по полному имени услуги. Примеры для поиска: /findbyallservicesnames/Жилищно-коммунальные услуги/Вода/Холодная вода
																					     /findbyallservicesnames/Жилищно-коммунальные услуги/Вода/Холодная вода
В поиск нужно вводить все имена услуг. Родительская услуга/Дочерняя услуга/Дочерняя дочерней

