# MyConfig.java
terdapat class MyConfig.java yang dimana memiliki 3 attribut static final yaitu DB_URl, DB_USER, DB_PASS
terdapat attribut connect yang diambil dari import.java.sql.connection
kemudian terdapat 1 method connection yang mana berguna untuk mengkoneksikan antara database dengan java 
dan apabila tidak berhasil maka akan menghasilkan output connection gagal

# Methode.java
terdapat class Methode.java yang mana memiliki 3 attribut static yang diambil dari import yang berbeda, connect dari connection, statement dari Statement, resultSet dari ResultSet
terdapat 4 method yaitu getDatabase(), insertData(), editData(), deleteData(),
###method getDatabase bertujuan untuk memperlihatkan data apa saja yang tersimpan di database
###method insertData memiliki 3 attribut yaitu String namaBaru, int hargaBaru dan jumlahBaru yang kemudian kita isi berdasarkan inputan dari user kemudian menambahkan data tersebut ke database
###method editData memiliki 1 attribut yaitu int jumlah, kemudian method ini bertujuan untuk mengganti data jumlah yang ada telah tersimpan di database sesuai dengan ID yang diinginkan (di siapkan dari awal ID 2) kemudian menghasilan output data berhasil diubah
method delete memiliki 1 attribut yaitu int id, kemudian method ini bertujuan untuk menghapus data yang ada pada database sesuai dengan id yang diinput oleh user , kemudian menghasilkan output data berhasil dihapus 

# Menu.java 
terdapat class Menu.java yang memiliki method showMenu yang mana menghubungkan database ke java dengan MyConfig.connection();
kemudian menjalankan program sesuai dengan tampilan menu yang telah diatur atau dibuat oleh user  

# App.java
terdapat class App.java yang memiliki method main (), yang didalamnya memanggil Menu.showMenu() untuk menjalankan program 