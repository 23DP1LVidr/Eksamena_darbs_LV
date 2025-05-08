# Medicīnas pārvaldības sistēma (MMS)

## Projekta pārskats

Medicīniskās pārvaldības sistēma (MMS) ir uz Java balstīta konsoles lietojumprogramma, kas izstrādāta, lai racionalizētu pacientu datu, apmeklējumu un produktu pārvaldību. Tā atbalsta divvalodu funkcionalitāti (latviešu un angļu valodā) un nodrošina tādas būtiskas funkcijas kā pacientu reģistrācija, apmeklējumu plānošana, produktu pārvaldība un droša pieteikšanās. Sistēma izmanto strukturētus failus datu glabāšanai, nodrošinot efektīvu datu izgūšanu un pārvaldību.

---

## Funkcijas

1. **Divu valodu atbalsts**

   * Interfeiss pieejams latviešu un angļu valodā.

2. **Uzīvotāja autentifikācija**

   * Droša pieteikšanās, izmantojot e-pastu un paroli.
   * Jaunu lietotāju reģistrācija ar pamata validāciju.

3. **Iecelšanas pārvaldība**

   * Pievienojiet, skatiet un dzēsiet tikšanās reizes.
   * Novērš plānošanas konfliktus.

4. **Produktu pārvaldība**

   * Medicīnisko produktu skatīšana, filtrēšana un iegāde.
   * Krājumu pārvaldība ar reāllaika atjauninājumiem.

5. **Leņķīga datu glabāšana**

   * Izmanto CSV failus pacientu, apmeklējumu un produktu datu uzglabāšanai.

6. **Interaktīva konsoles saskarne**

   * Skaidra, lietotājam draudzīga konsoles izeja ar atsaucīgām izvēlnēm.

---

## Failu struktūra

Projektā datu glabāšanai un pārvaldībai tiek izmantoti vairāki faili:

#### **Failu struktūra**

```
MedicalManagementSystem/
│
├── src/
│ ├──── App.java
│ ├── ├── PatientManager.java
│ ├── ├── AppointmentManager.java
│ ├── ├── ProductManager.java
│ ├──── Console.java
│ └── └── Show.java
│
├── data/
│ ├──── patients.csv # Uzglabā pacientu informāciju (vārds, uzvārds, e-pasts, parole)
│ ├──── appointments.csv # Uzglabā apmeklējuma datus (lietotājs, datums, apraksts, ID)
│ └──── products.csv # Uzglabā produktu datus (id, nosaukums, apraksts, cena, krājums)
│
├── README.md # Projekta dokumentācija (šis fails)
└── LICENSE # Licences fails (pēc izvēles)
```

#### **CSV failu formāti**

**patients.csv**

```
vārds,uzvārds,e-pasts,parole
John,Doe,john.doe@gmail.com,1234
Anna,Berzina,anna.berzina@gmail.com,abcd
```

**appointments.csv**

```
lietotājs,datums,apraksts,ID
admin,2023-08-12 12:20,Sistēmas uzturēšana,1
janis.liepins@gmail.com,2025-06-01 11:00,Zobu tīrīšana,2
```

**produkti.csv**

```
id,nosaukums,apraksts,cena,krājums
1,Paracetamols,500mg pretsāpju tabletes,2,1000
2,Ibuprofēns,200mg pretiekaisuma tabletes,3,1000
3,Deguna aerosols, ātras darbības līdzeklis pret aizcietējumiem,5,998
```

---

## Funkcionālās prasības

* **Uzīvotāja saskarne**: Divvalodu (latviešu vai angļu valodā) konsoles saskarne.
* **Objektu pārvaldība**:

  * Vismaz 3 objekti (pacienti, apmeklējumi, produkti).
* **Datu glabāšana**:

  * Pastāvīgai datu glabāšanai izmanto .csv failus.
* **Datu operācijas**:

  * Ierakstu pievienošana, rediģēšana, dzēšana.
  * Datu meklēšana un filtrēšana.
  * Šķirošana pēc vairākiem kritērijiem.
  * Datu apstrāde ar aprēķiniem (piemēram, produktu krājumu atjaunināšana).
* **Papildu funkcijas**:

  * Dinamiskā izvēlne, pamatojoties uz lietotāja ievadītajiem datiem.

---

## Instalēšana un iestatīšana

1. Lejuplādējiet arhīvu ar repozitoriju:

```
https://github.com/23DP1LVidr/Eksamena_darbs_LV
```

2. Izarhivējat un palaidiet app.java

```
java src/App
```