using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Application7;

namespace Application5
{
    class SavingsAccount : Account
    {
        private decimal interest;
        //First countermeasure is to make instance variables for the constructer. Otherwise pain
      
        public SavingsAccount(String name, int number, decimal balance, decimal interest)
            : base(name,number,balance)
        {
            setAccountName(name);
            setAccountNumber(number);
            setBalance(balance);
            setInterestRate(interest);            
        }

        public void setInterestRate(decimal interest)
        {
            if (interest < 0)
                throw new NegativeNumberException();

            else
            {
                this.interest = interest;
            }
        }

        public override void PrintAccount()
        {
            Console.WriteLine("Account Name: {0}", base.getAccountName());
            Console.WriteLine("Account Number: {0}", getAccountNumber());
            Console.WriteLine("Balance: {0}", CalculateInterest());
            Console.WriteLine("Interest rate: {0}", interest);
        }

        public decimal CalculateInterest()
        {
            return (((interest / 100) * base.getBalance()) + base.getBalance());
        }

        public override bool debit(decimal subtract)
        {
            if (subtract > balance)
                Console.WriteLine("Insufficient Funds");
            else
            {
                base.debit(subtract);
            }

            return true;
        }
    }
}
