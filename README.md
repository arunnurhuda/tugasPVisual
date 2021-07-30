# tugasPVisual


1. Buat Database MySQL di XAMPP localhost/phpMyAdmin dengan detail dibawah, atau langung import file arunanet.sql ke phpmyadmin
===================================================

Database name : arunanet

===================================================

Tabel name : pelanggan

    id = varchar 10, primary key

    nama = varchar 40

    no_wa = varchar 20

    alamat = varchar 100

    tgl_pasang = varchar 10

    speed = varchar 10

    harga = varchar 20

======================================================================

    table name : login

    user = varchar 20, primary key

    pass = varchar 40

2. Buat new project di Netbeans (java with ant) beri nama …
3. Buat file di source package (klik kanan) pilih  tipe Jframe Form beri nama …
4. Pada Libraries (klik kanal) pilih add library > create > beri nama > add jar/folder > pilih mysql-connector-java-8.0.25.jar yang ada di folder mysql-connector-java-8.0.25 > OK > kemudian pilih library yg tadi dibuat dan OK
![image](https://user-images.githubusercontent.com/39723202/127572915-eea04994-b963-4ff9-a205-b40ea3417e8c.png)





======Cara copy Source code dari github ke netbeans======
1. Right click on project-> Versioning-> Initialize Git Repository-> OK.

2. Pull Repository from GitHub and Merge:
    a. Right click on project-> Git-> Remote-> Pull->
    
    b. Enter Git Repository Link in the Repository URL field,
    
    c. Blank/Kosongkan Username & Password
    
    d. Select Remote Branches "master -> origin/master [ ]" and click Finish,
    
    e. A dialogue will appear, click on Merge.


![image](https://user-images.githubusercontent.com/39723202/127571587-c4470b83-0486-4354-b368-d13c366fb957.png)
![image](https://user-images.githubusercontent.com/39723202/127571688-3055825e-6765-4db3-a4e3-fe626a6ba24d.png)
![image](https://user-images.githubusercontent.com/39723202/127571774-0cce46aa-1711-4e68-9745-04e609fee7eb.png)

