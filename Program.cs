using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter the title of the book: ");
            string title = Console.ReadLine();

            Console.Write("Enter the author of the book: ");
            string author = Console.ReadLine();

            Console.Write("Enter the publication year of the book: ");
            int publicationYear = int.Parse(Console.ReadLine());

            Console.Write("Enter the ISBN of the book: ");
            string isbn = Console.ReadLine();


            Console.WriteLine("\nBook Information:");
            Console.WriteLine("-------------------");
            Console.WriteLine("Title: {title}");
            Console.WriteLine("Author: {author}");
            Console.WriteLine("Publication Year: {publicationYear}");
            Console.WriteLine("ISBN: {isbn}");
            Console.ReadLine();
        }
    }
}
