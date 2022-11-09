# spring-mvc-security
Spring MVC dan Spring Security

# Inisialisasi
Setelah tabel-tabel terbuat, masukkan data sebagai berikut untuk mencoba:


	insert into role values ('ROLE_ADMIN')
	insert into role values ('ROLE_USER')

	insert into usertable values ('awy','$2a$12$T1k7288wxYIqSCvCOzbP8uvg8YqWQ/Bfm7ROZG81BiScpGEozJ9Q2')
	insert into usertable values ('budi','$2a$12$7ke21VRWcvrKLvkV3U6q9eI3di2ib2iHwNzG3IC0HeBwWdvqFq1pS')

	insert into user_role (usrnm,rlid) values ('awy','ROLE_USER')
	insert into user_role (usrnm,rlid) values ('budi','ROLE_ADMIN')

Format password BCRYPT dapat dibuat dengan bantuan situs online bcrypt. Pada contoh yang dibuat username awy dengan password awy, dan budi dengan password budi