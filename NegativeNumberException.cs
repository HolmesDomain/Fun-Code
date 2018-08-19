using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Application7
{
    class NegativeNumberException : Exception
    {
        public NegativeNumberException(String messageValue) : base("Invalid Entry - Negative numbers not permitted")
        {
            
        }

        public NegativeNumberException() : base("Invalid Entry - Negative numbers not permitted")
        {
            //
        }
    }
}
