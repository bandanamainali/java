##   date:2021 dec 28   submitted date 2022 jan 1  

## Stream
It is necessary for programs to have an ability to read and write data.Java provides streams as a general mechanism for dealing with I/O.A stream is a logical entity that either produces or consumes information. Streams implement sequential assess of data. There are two kinds of streams i.e input strean and output stream.
* ### Input stream 
     It is an object from which we can read a sequence of bytes.
 * ### Output stream
     It is an object from which we can write a sequence of bytes.

 The input stream acts as a source of data whereas the output stream  acts a destination of the data. Some entities can act as both input and output streams.

## Zip file stream
Zip files are the archives that store one or more files in compressed form.The java.util.zip contains the classes for working with zip files.Each zip files has a header which includes information like name of the file and the compression method used like GZIP and ZIP.ZipInputStream() is used to read a Zip file by layering the zipInputSream constructor on to a FileInputStream().We then need to look at the individual entries in the archive .The getNextEntry() methid returns an object of tyoe zipEntry that sescribes the entry.The read methos of the ZipInputStream is modified to return -1 ta the end of the current entry.

## Object Stream
Object streams support I/O of objects.Most, but not all, standard classes support serialixation of their objects. Object Stream is useful while reading and writing objects that are created using different datatypes. E.g. we may have an array of student records but contains objects that are actually instances of a child class.If we have to save files that contain such information,then we must first save the type of each object and then write the data that defines the current data of the object.And, when we read, then we have to raed the object type the create blank object followed by filling of the data have been stored in the file.

This entire process is automated by the Object Serialixation mechanism.Object serialixation is an approach by which an object can be represented as a sequence of bytes that contains the object data and other information like the types of data stored,etc.