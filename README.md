##**ART Gallery**
###(servlets based web application for photo hosting)

---
####**Introduction**

ArtGallery is web application, the main purpose of whose is to realize on practice knowledge about basic Java-web
technologies -  Servlets, JSP, JSTL, Bootstrap with custom CSS frontend; and database layer - JDBC with MySQL.
This program is saving uploaded photo files with additional description, also exist possibilities to see detailed
characteristics and deleting files.

---
####**Brief Description Of The Project**

Some functions of this project:
> **Backend:**
> - Security functions: Register (with custom RegEx validation), Login, Logout (with using Filter and FilterChain)
> - Function of file uploading and saving to the local storage.
> - Image processor: analysing aspect ratio and size, creating correct image "thumbnails" (the thumbnails width and height you can assign in settings.properties file).
> - Exception and Error Handling
> - Logging by Log4j.
**Database layer:**
> - JDBC, MySQL, ServletContextListener (for connection to database on servlet initialization)
**Frontend:**
> - JSP, JSTL, Bootstrap, CSS, jQuery with Magnific-popup plugin.

---

#### **Essential information for launch this project**
DDL code for PostgreSQL database for creating essential tables.

**Pictures table:**
>CREATE TABLE `pictures` (
	`picture_id` INT(10) NOT NULL AUTO_INCREMENT,
	`name_original` VARCHAR(150) NULL DEFAULT '0',
	`name_unique` VARCHAR(50) NOT NULL DEFAULT '0',
	`extension` VARCHAR(4) NULL DEFAULT '0',
	`size` FLOAT NULL DEFAULT '0',
	`resolution` VARCHAR(16) NULL DEFAULT '0',
	`date_of_creation` DATETIME NULL DEFAULT NULL,
	`title` VARCHAR(50) NULL DEFAULT '0',
	`description_full` VARCHAR(255) NULL DEFAULT '0',
	`description_brief` VARCHAR(55) NULL DEFAULT '0',
	PRIMARY KEY (`picture_id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=73
;

**Users table:**
>CREATE TABLE `users` (
	`user_id` INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(20) NOT NULL DEFAULT '',
	`email` VARCHAR(30) NOT NULL DEFAULT '',
	`password` VARCHAR(20) NOT NULL DEFAULT '',
	PRIMARY KEY (`user_id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=9
;

**Users-pictures table:**
>CREATE TABLE `users_pictures` (
	`id` INT(10) NOT NULL AUTO_INCREMENT,
	`user_id` INT(10) NOT NULL,
	`picture_id` INT(10) NOT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=71
;

---

####**Additional libraries:**

[/web/lib/imgscalr-lib-4.2.jar][1] - for image processing (get info, resize).
[/web/lib/mysql-connector-java-5.0.5.jar][2] - for connection to MySQL.
[/web/lib/log4j-1.2.17.jar][3]   - for Log4j.
...and other necessary libraries for servlets functionality.

**[Download all libraries in one ZIP file][4]**

---

Crated in [StackEditor][6];   made by <obelets.sergey@gmail.com>

[1]: http://www.java2s.com/Code/Jar/i/Downloadimgscalrlib42jar.htm
[2]:https://dev.mysql.com/downloads/connector/j/5.0.html
[3]:https://logging.apache.org/log4j/1.2/download.html
[4]:https://yadi.sk/d/H5ZLSXyC3Gnk37