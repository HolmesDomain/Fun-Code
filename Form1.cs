using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Application8
{
    public partial class Form1 : Form
    {
        private String name;
        private String supervisor;
        private String client;
        private String contract;
        private String project;
        private String perProject;
        private String together;
        private String mondayStr, sundayStr, tuesdayStr, wednesdayStr, fridayStr, thursdayStr, saturdayStr;
        private int vacay = 0;
        private int week;
        private decimal hours;
        private decimal weekhours;
        private decimal pay;
        private decimal overtime;
        private decimal rate = 40;
        private int counter = 0;
        
        //Array
        decimal[] line = new decimal[9];
        decimal[] amon = new decimal[9];
        decimal[] atue = new decimal[9];
        decimal[] awed = new decimal[9];
        decimal[] athur = new decimal[9];
        decimal[] afri = new decimal[9];
        decimal[] asat = new decimal[9];
        decimal[] asun = new decimal[9];

        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {}

        private void textBox3_TextChanged(object sender, EventArgs e)
        {}

        private void label7_Click(object sender, EventArgs e)
        {}

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Fill variables
            //Employee name

            try
            {
                if (textBox1.Text == "" && textBox1.Enabled != false)
                    throw new System.ArgumentException();
                else
                    name = textBox1.Text;
            }

            catch (ArgumentException)
            {
                MessageBox.Show("Employeee name needed");
                return;
            }

            //Supervisor name
            try
            {
                if (textBox2.Text == "" && textBox2.Enabled != false)
                    throw new System.ArgumentException();
                else
                    supervisor = textBox2.Text;
            }

            catch (ArgumentException)
            {
                MessageBox.Show("Supervisor name needed");
                return;
            }

            contract = " " + textBox5.Text;

            //Client information
            client = " " + textBox4.Text;

            //validate week     
            if (textBox1.Enabled == true)
            {
                week = Convert.ToInt32(textBox3.Text);

                if (week > 52)
                {
                    MessageBox.Show("Must be under 52 weeks");
                    return;
                }
            }

            //set hour variables
            if (sunBox.Text == "")
            {
                if (checkBox1.Checked == true)
                {
                    asun[counter] = 0;
                    vacay++;
                }

                else
                {
                    MessageBox.Show("Check Holiday if no hours worked");
                    return;
                }
            }
            else
                asun[counter] = Convert.ToDecimal(sunBox.Text);


            if (monBox.Text == "")
            {
                if (checkBox3.Checked == true)
                {
                    amon[counter] = 0;
                    vacay++;
                }

                else
                {
                    MessageBox.Show("Check Holiday if no hours worked");
                    return;
                }
            }
            else
                amon[counter] = Convert.ToDecimal(monBox.Text);

            if (textBox11.Text == "")
            {
                if (checkBox4.Checked == true)
                {
                    atue[counter] = 0;
                    vacay++;
                }

                else
                {
                    MessageBox.Show("Check Holiday if no hours worked");
                    return;
                }
            }
            else
                atue[counter] = Convert.ToDecimal(textBox11.Text);

            if (textBox14.Text == "")
            {
                if (checkBox5.Checked == true)
                {
                    awed[counter] = 0;
                    vacay++;
                }

                else
                {
                    MessageBox.Show("Check Holiday if no hours worked");
                    return;
                }
            }
            else
                awed[counter] = Convert.ToDecimal(textBox14.Text);

            if (textBox15.Text == "")
            {
                if (checkBox6.Checked == true)
                {
                    athur[counter] = 0;
                    vacay++;
                }

                else
                {
                    MessageBox.Show("Check Holiday if no hours worked");
                    return;
                }
            }
            else
                athur[counter] = Convert.ToDecimal(textBox15.Text);

            if (textBox9.Text == "")
            {
                if (checkBox2.Checked == true)
            {
                afri[counter] = 0;
                    vacay++;
            }

            else
            {
                MessageBox.Show("Check Holiday if no hours worked");
                return;
            }
            }
            else
            afri[counter] = Convert.ToDecimal(textBox9.Text);

            if (textBox13.Text == "")
            {
                if (checkBox7.Checked == true)
                {
                    asat[counter] = 0;
                    vacay++;
                }

                else
                {
                    MessageBox.Show("Check Holiday if no hours worked");
                    return;
                }
            }
            else
                asat[counter] = Convert.ToDecimal(textBox13.Text);

            //error check
            if (asun[counter] > 24 || amon[counter] > 24 || atue[counter] > 24 || awed[counter] > 24 || athur[counter] > 24 || afri[counter] > 24 || asat[counter] > 24)
            {
                MessageBox.Show("Cannot have more than 24 hours in a day");
                return;
            }

            if (asun[counter] < 0 || amon[counter] < 0 || atue[counter] < 0 || awed[counter] < 0 || athur[counter] < 0 || afri[counter] < 0 || asat[counter] < 0)
            {
                MessageBox.Show("Check Holiday if no hours worked");
                return;
            }

            //Project information
            project = " " + textBox6.Text;
            together = "<Client: " + client + ">" + contract + " " + project + " ";

            mondayStr += together + amon[counter] + " hours | ";
            sundayStr += together + asun[counter] + " hours | ";
            tuesdayStr += together + atue[counter] + " hours | ";
            wednesdayStr += together + awed[counter] + " hours | ";
            thursdayStr += together + athur[counter] + " hours | ";
            fridayStr += together + afri[counter] + " hours | ";
            saturdayStr += together + asat[counter] + " hours | ";

            //set week hours
            weekhours += asun[counter] + amon[counter] + atue[counter] + awed[counter] + athur[counter] + afri[counter] + asat[counter];

            //insert into counter array
            line[counter] = weekhours;

            //adjust per project display
            perProject += together + line[counter] + " hours           ";
            

            hours += weekhours;

            if (hours > 40)
                    overtime += (hours - rate) * ((decimal)1.5 * 15);
                else
                    overtime = 0;

            //calculate 
            pay += overtime + (hours * (decimal)15);

            //Display & concatenation
            richTextBox1.Text = 
            "Reporting period: " + "Week " + week + Environment.NewLine + "Employee name: " + name + Environment.NewLine +          
            "Supervisor name: " + supervisor + Environment.NewLine + Environment.NewLine + "------------Payroll Infomation------------"
            + Environment.NewLine + Environment.NewLine + "Sunday: " + Environment.NewLine + sundayStr + Environment.NewLine +
            "Monday: "+ Environment.NewLine + mondayStr + Environment.NewLine + "Tuesday: " + Environment.NewLine 
            + tuesdayStr +
            Environment.NewLine + "Wednesday: " + Environment.NewLine + wednesdayStr + Environment.NewLine + "Thursday: " 
            + Environment.NewLine + thursdayStr+
            Environment.NewLine + "Friday: " + Environment.NewLine + fridayStr 
            + Environment.NewLine + "Saturday: " + Environment.NewLine + saturdayStr + 
            Environment.NewLine + Environment.NewLine + "Hours per project: " + Environment.NewLine       
            + perProject + Environment.NewLine + "Week hours: " + line[counter] + Environment.NewLine + "Overtime rate: x1.5" 
            + Environment.NewLine + "Regular pay: 15hr" + Environment.NewLine +
            "Overtime pay: " + overtime + Environment.NewLine + "Gross Pay: " + pay + Environment.NewLine + "Vacation/Holidays: " + vacay;

            if (line[counter] < 40)
                label10.Text = "<40";
            else
                label10.Text = "";

            //clear text boxes
            textBox1.Clear(); textBox15.Clear(); textBox2.Clear(); textBox3.Clear();
            textBox11.Clear(); textBox4.Clear(); textBox5.Clear(); textBox6.Clear();
            textBox13.Clear(); textBox9.Clear(); monBox.Clear(); sunBox.Clear();
            textBox14.Clear();
            
            //counter
            counter++;
            
            //disable un-needed text boxes
            textBox1.Enabled = false; textBox3.Enabled = false;
            textBox2.Enabled = false;
            
            //clear text boxes
            checkBox1.Checked = false; checkBox2.Checked = false; checkBox3.Checked = false;
            checkBox4.Checked = false; checkBox5.Checked = false; checkBox6.Checked = false;
            checkBox7.Checked = false;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {}

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {}

        private void checkedListBox1_SelectedIndexChanged(object sender, EventArgs e)
        {}

        private void checkBox1_CheckedChanged_1(object sender, EventArgs e)
        {}

        private void checkBox3_CheckedChanged(object sender, EventArgs e)
        {}
    }
}
