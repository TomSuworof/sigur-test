# sigur-test

Тестовое задание в компанию Sigur

[Текст задания](./test%20task.pdf)

[Скрипт миграции](./src/main/resources/db/migration/V1__Init_DB.sql)

Применённые технологии
- Spring Boot
- JPA
- Hibernate Validator
- Pub/Sub pattern средствами Spring

Пример логов: 
```
2022-08-05 15:36:28  INFO c.s.sigurtest.services.EmployeeService   : 2022-01-01 00:00:00. Сотрудник -1850036729 нанят 2022-02-06 19:18:58. Отдел: department 8
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.GuestService  : Гостю -965347613 назначена встреча сотруднику -1850036729. Отдел: department 8. Дата: 2022-02-07 00:59:17. До встречи осталось: 37
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта AE46F9BD1E36AFB08C8057AC19FDDA61
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-01 02:24:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-01 04:48:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-01 07:12:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-01 09:36:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-01 12:00:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-01 14:24:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-01 16:48:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта BF549920B04A341943F8244DF6F0A341
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-01 21:36:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:28  INFO c.s.sigurtest.services.EmployeeService   : 2022-01-02 00:00:00. Сотрудник -418347642 нанят 2022-06-14 20:08:10. Отдел: department 7
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : 2022-01-02 00:00:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:28  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 83DB11C359361111AFDE0E475E9A39BD
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : 2022-01-02 04:48:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : 2022-01-02 07:12:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : 2022-01-02 09:36:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : 2022-01-02 12:00:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта D3EF693201B81BF282D1A32E39C837A9
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : 2022-01-02 16:48:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : 2022-01-02 19:12:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта F8DCE0F69A9839D6500C52DC87E04F3D
2022-08-05 15:36:29  INFO c.s.sigurtest.services.EmployeeService   : 2022-01-03 00:00:00. Сотрудник -1072906975 нанят 2022-06-11 10:31:24. Отдел: department 9
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 00:00:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:29  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 02:24:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 04:48:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта DD10CD4355725E056BB92B510EB77451
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 09:36:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 12:00:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 14:24:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 16:48:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 19:12:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-03 21:36:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:30  INFO c.s.sigurtest.services.EmployeeService   : 2022-01-04 00:00:00. Сотрудник -1915736922 нанят 2022-10-06 17:57:47. Отдел: department 1
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 00:00:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 02:24:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:30  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 04:48:00. Предоставлен доступ сотруднику -1915736922. Отдел: department 1. Карта: 9446F028830556354FA7C53D5A7FC16D
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 07:12:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта CBDB3D122F31099916E0FB010B9868D7
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 12:00:00. Предоставлен доступ сотруднику -1915736922. Отдел: department 1. Карта: 9446F028830556354FA7C53D5A7FC16D
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 14:24:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 16:48:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 19:12:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : 2022-01-04 21:36:00. Предоставлен доступ сотруднику -1072906975. Отдел: department 9. Карта: C2A50A73064A1B9140978C643B360BC3
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 49C728E10B7B08CF2B224410B5B62A25
2022-08-05 15:36:31  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 5C7EAC27CAE342FDBFA9D464C714C9E4
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : 2022-01-05 04:48:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 68461A90B0C9FE4550A35B9F36C0C16C
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 0CDDF1B474CEB1A81C5F6646D0A99A3F
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : 2022-01-05 12:00:00. Предоставлен доступ сотруднику -1072906975. Отдел: department 9. Карта: C2A50A73064A1B9140978C643B360BC3
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 4E0BF6749944A6DC1E831B84943710AC
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : 2022-01-05 16:48:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : 2022-01-05 19:12:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : 2022-01-05 21:36:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:32  INFO c.s.sigurtest.services.EmployeeService   : 2022-01-06 00:00:00. Сотрудник -1129352593 нанят 2022-04-14 13:11:55. Отдел: department 2
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 00:00:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:32  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 02:24:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 04:48:00. Предоставлен доступ сотруднику -1072906975. Отдел: department 9. Карта: C2A50A73064A1B9140978C643B360BC3
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта AB943EAE45117523FDF890E53B30AF9F
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 09:36:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 12:00:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 14:24:00. Предоставлен доступ сотруднику -1129352593. Отдел: department 2. Карта: D724E84FDA39A28EA10DFA4912B5C4FA
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 16:48:00. Предоставлен доступ сотруднику -1129352593. Отдел: department 2. Карта: D724E84FDA39A28EA10DFA4912B5C4FA
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 19:12:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-06 21:36:00. Предоставлен доступ сотруднику -418347642. Отдел: department 7. Карта: E7622A6E6EB85AE6C1A8CD23378711EE
2022-08-05 15:36:33  INFO c.s.sigurtest.services.EmployeeService   : 2022-01-07 00:00:00. Сотрудник 58131171 нанят 2022-09-13 19:51:01. Отдел: department 2
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.GuestService  : Гостю -853092413 назначена встреча сотруднику 58131171. Отдел: department 2. Дата: 2022-12-15 08:28:06. До встречи осталось: 342
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 00:00:00. Предоставлен доступ сотруднику 58131171. Отдел: department 2. Карта: C748D0A622F91D7C4DAECBD1993E7919
2022-08-05 15:36:33  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 02:24:00. Предоставлен доступ сотруднику -1072906975. Отдел: department 9. Карта: C2A50A73064A1B9140978C643B360BC3
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 04:48:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 07:12:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 09:36:00. Предоставлен доступ сотруднику -1072906975. Отдел: department 9. Карта: C2A50A73064A1B9140978C643B360BC3
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 12:00:00. Предоставлен доступ сотруднику -1129352593. Отдел: department 2. Карта: D724E84FDA39A28EA10DFA4912B5C4FA
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 14:24:00. Предоставлен доступ сотруднику -1072906975. Отдел: department 9. Карта: C2A50A73064A1B9140978C643B360BC3
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 16:48:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 19:12:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-07 21:36:00. Доступ запрещён гостю -853092413. Карта: 7EFE23821BAF4315C34D29C57FC8680C
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 7EFE23821BAF4315C34D29C57FC8680C
2022-08-05 15:36:34  INFO c.s.sigurtest.services.EmployeeService   : 2022-01-08 00:00:00. Сотрудник -966754530 нанят 2022-08-21 18:29:57. Отдел: department 4
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.GuestService  : Гостю -836715137 назначена встреча сотруднику -966754530. Отдел: department 4. Дата: 2022-09-04 23:35:36. До встречи осталось: 239
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 00:00:00. Доступ запрещён гостю -965347613. Карта: 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 6A8F76F90F1D7BED09134FFF1E203153
2022-08-05 15:36:34  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 02:24:00. Предоставлен доступ сотруднику -1915736922. Отдел: department 1. Карта: 9446F028830556354FA7C53D5A7FC16D
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 04:48:00. Предоставлен доступ сотруднику 58131171. Отдел: department 2. Карта: C748D0A622F91D7C4DAECBD1993E7919
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 07:12:00. Доступ запрещён гостю -853092413. Карта: 7EFE23821BAF4315C34D29C57FC8680C
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 7EFE23821BAF4315C34D29C57FC8680C
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 09:36:00. Предоставлен доступ сотруднику -966754530. Отдел: department 4. Карта: 83BBF556C4CDC4204EA49F12EEFC9D5C
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 12:00:00. Предоставлен доступ сотруднику -1915736922. Отдел: department 1. Карта: 9446F028830556354FA7C53D5A7FC16D
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 14:24:00. Предоставлен доступ сотруднику -1129352593. Отдел: department 2. Карта: D724E84FDA39A28EA10DFA4912B5C4FA
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 16:48:00. Предоставлен доступ сотруднику -966754530. Отдел: department 4. Карта: 83BBF556C4CDC4204EA49F12EEFC9D5C
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 19:12:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-08 21:36:00. Предоставлен доступ сотруднику -966754530. Отдел: department 4. Карта: 83BBF556C4CDC4204EA49F12EEFC9D5C
2022-08-05 15:36:35  INFO c.s.sigurtest.services.EmployeeService   : 2022-01-09 00:00:00. Сотрудник -411961010 нанят 2022-02-10 12:01:13. Отдел: department 5
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.GuestService  : Гостю 1722114233 назначена встреча сотруднику -411961010. Отдел: department 5. Дата: 2022-07-30 02:24:28. До встречи осталось: 202
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 00:00:00. Предоставлен доступ сотруднику 58131171. Отдел: department 2. Карта: C748D0A622F91D7C4DAECBD1993E7919
2022-08-05 15:36:35  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта EADECBA43AA3C072FB24152A69806BF3
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 04:48:00. Предоставлен доступ сотруднику -1072906975. Отдел: department 9. Карта: C2A50A73064A1B9140978C643B360BC3
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 07:12:00. Доступ запрещён гостю 1722114233. Карта: DA23FB52F6294707DA8F8587ED152DBD
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта DA23FB52F6294707DA8F8587ED152DBD
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 09:36:00. Предоставлен доступ сотруднику 58131171. Отдел: department 2. Карта: C748D0A622F91D7C4DAECBD1993E7919
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 12:00:00. Доступ запрещён гостю -853092413. Карта: 7EFE23821BAF4315C34D29C57FC8680C
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта 7EFE23821BAF4315C34D29C57FC8680C
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 14:24:00. Предоставлен доступ сотруднику -1129352593. Отдел: department 2. Карта: D724E84FDA39A28EA10DFA4912B5C4FA
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 16:48:00. Доступ запрещён гостю 1722114233. Карта: DA23FB52F6294707DA8F8587ED152DBD
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта DA23FB52F6294707DA8F8587ED152DBD
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 19:12:00. Предоставлен доступ сотруднику 58131171. Отдел: department 2. Карта: C748D0A622F91D7C4DAECBD1993E7919
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-09 21:36:00. Предоставлен доступ сотруднику -1850036729. Отдел: department 8. Карта: 4295A94033D90404A294FE191CC19478
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-10 00:00:00. Предоставлен доступ сотруднику 58131171. Отдел: department 2. Карта: C748D0A622F91D7C4DAECBD1993E7919
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : 2022-01-10 02:24:00. Доступ запрещён гостю 1722114233. Карта: DA23FB52F6294707DA8F8587ED152DBD
2022-08-05 15:36:36  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта DA23FB52F6294707DA8F8587ED152DBD
2022-08-05 15:36:37  INFO c.salat.sigurtest.services.PassService   : 2022-01-10 04:48:00. Доступ запрещён гостю 1722114233. Карта: DA23FB52F6294707DA8F8587ED152DBD
2022-08-05 15:36:37  INFO c.salat.sigurtest.services.PassService   : Поднесена неизвестная карта DA23FB52F6294707DA8F8587ED152DBD
```