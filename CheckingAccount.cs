using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Application7;

namespace Application5
{
    class CheckingAccount : Account
    {
        private decimal fee;


        public CheckingAccount(String name,int number,decimal balance,decimal fee)
            : base(name,number,balance)
        {
            setAccountName(name);
            setAccountNumber(number);
            setBalance(balance);
            setFeeAmount(fee);


        }

        public void setFeeAmount(decimal fee)
        {
            if (fee < 0)
                throw new NegativeNumberException();

            else
            {
                this.fee = fee;
            }
        }

        public override void credit(decimal add)
        {
            balance -= fee;
            base.credit(add);
        }

        public override bool debit(decimal subtract)
        {
            if (subtract > balance)
                Console.WriteLine("Insufficient Funds");
            else
            {
                balance -= fee;
                base.debit(subtract);
            }

            return true;
        }

        public override void PrintAccount()
        {
            Console.WriteLine("Account Name: {0}", base.getAccountName());
            Console.WriteLine("Account Number: {0}", getAccountNumber());
            Console.WriteLine("Balance: {0}", getBalance());
            Console.WriteLine("Fee charged: {0}", fee);
        }
    }
}
