function Book(name,author)
{
    this.name = name;
    this.author = author;
}

Book.prototype.getInfo = function()
{
    console.log(`the ${this.name} is wriiten by ${this.author}`);
}

const BOOK1 = new Book("C++ Programming","Sunil Panchal");
const BOOK2 = new Book("Pyhton","Ankit Singh");

BOOK1.getInfo();
BOOK2.getInfo();
