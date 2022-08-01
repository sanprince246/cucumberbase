Feature: verifying adactin hotel login page details

  Scenario Outline: verifying adactin hotel login with valid credentials
    Given User is on the adactin Login page
    When User should login "<userName>" and "<password>"
    And User should search hotels "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsRoom>","<childrenRoom>"
    And User should select hotel
    And User should book hotel "<firstName>","<lastName>","<address>","<CCno>","<CCtype>""<expiryDate>","<expiryMonth>","<CCVno>"
    Then User should confirm hotel

    Examples: 
      | userName  | password | location    | hotels         | roomType     | noOfRooms | checkInDate | checkOutDate | adultsRoom | childrenRoom | firstName | lastName | address        | CCno             | CCtype           | expiryDate | expiryMonth | CCVno |
      | Princesan | Elan246# | Sydney      | Hotel Creek    | Double       | 4 - Four  | 17-07-2022  | 17-07-2022   | 2 - Two    | Ela          | san       | Ela      | manapparai     | 9876543211234567 | American Express | January    |        2013 |   799 |
      | Princesan | Elan246# | Melbourne   | Hotel Sunshine | Standard     | 1 - One   | 16-07-2022  | 17-07-2022   | 1 - One    | 2 - Two      | ganesh    | gopi     | coiambatore    | 8876543211234567 | VISA             | February   |        2014 |   456 |
      | Princesan | Elan246# | Brisbane    | Hotel Hervey   | Double       | 2 - Two   | 17-07-2022  | 18-07-2022   | 2 - Two    | 1 - One      | san       | ganesh   | madurai        | 7876543211234567 | American Express | March      |        2015 |   235 |
      | Princesan | Elan246# | Adelaide    | Hotel Cornice  | Deluxe       | 3 - Three | 18-07-2022  | 19-07-2022   | 3 - Three  | 2 - Two      | lash      | aki      | trichy         | 6876543211234567 | Master Card      | April      |        2016 |   456 |
      | Princesan | Elan246# | London      | Hotel Creek    | Double       | 5 - Five  | 17-07-2022  | 17-07-2022   | 2 - Two    | 3 - Three    | santh     | Nis      | kanchipuram    | 8976543211234567 | American Express | May        |        2017 |   789 |
      | Princesan | Elan246# | New York    | Hotel Hervey   | Super Deluxe | 6 - Six   | 16-07-2022  | 17-07-2022   | 4 - Four   | 2 - Two      | san       | jk       | namakkal       | 6576543211234567 | VISA             | June       |        2018 |   456 |
      | Princesan | Elan246# | Los Angeles | Hotel Creek    | Double       | 7 - Seven | 17-07-2022  | 18-07-2022   | 2 - Two    | 3 - Three    | karan     | karuna   | karur          | 9566543211234567 | American Express | July       |        2019 |   789 |
      | Princesan | Elan246# | Paris       | Hotel Sunshine | Standard     | 8 - Eight | 17-07-2022  | 17-07-2022   | 1 - One    | 2 - Two      | san       | bala     | palani         | 9876893211234567 | Master Card      | August     |        2018 |   456 |
      | Princesan | Elan246# | Sydney      | Hotel Creek    | Double       | 9 - Nine  | 16-07-2022  | 17-07-2022   | 2 - Two    | 4 - Four     | krisnan   | hari     | kumbakonam     | 9876323211234567 | American Express | September  |        2017 |   654 |
      | Princesan | Elan246# | London      | Hotel Creek    | Deluxe       | 10 - Ten  | 17-07-2022  | 17-07-2022   | 3 - Three  | 2 - Two      | san       | abishek  | ramanathapuram | 9877843211234567 | Master Card      | October    |        2016 |   753 |
