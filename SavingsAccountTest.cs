using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Application4
{
    class SavingsAccountTest
    {
        static void Main(string[] args)
        {

            //I have to admit I was confused the the CalculateMonthlyInterest and CalculateAnnualInterestRate
            //Especially because the example on the word doc only says calculate monthly interest.

            SavingsAccount saver1 = new SavingsAccount(4000,"Saver_One");
            SavingsAccount saver2 = new SavingsAccount(5000,"Saver_two");
            SavingsAccount saver3 = new SavingsAccount();

            saver1.setAnnualInterestRate(4);
            saver2.setAnnualInterestRate(4);
            saver3.setAnnualInterestRate(4);

            saver3.setSavingsAccountName("Saver_Three");
            saver3.setSavingsBalance(50000);

            Console.WriteLine("Initial savings account balances:");
            saver1.PrintSavingsAccount();
            saver2.PrintSavingsAccount();
            saver3.PrintSavingsAccount();
            Console.WriteLine();

            saver1.CalculateMonthlyInterestRate();
            saver2.CalculateMonthlyInterestRate();
            saver3.CalculateMonthlyInterestRate();

            Console.WriteLine("Savings account balances afer calculating monthly interest at 4%");
            saver1.PrintSavingsAccount();
            saver2.PrintSavingsAccount();
            saver3.PrintSavingsAccount();
            Console.WriteLine();

            saver1.setAnnualInterestRate(5);
            saver2.setAnnualInterestRate(5);
            saver3.setAnnualInterestRate(5);

            Console.WriteLine("Savings account balances after calculating monthly interest at 5%:");
            saver1.PrintSavingsAccount();
            saver2.PrintSavingsAccount();
            saver3.PrintSavingsAccount();
            Console.WriteLine();

            Console.WriteLine("Press the [enter] key to quit.");
            Console.ReadKey();
        }
    }
}
