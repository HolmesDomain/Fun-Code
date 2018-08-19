#include<iostream>
using namespace std;
int main() //Day 3!!!
{
	bool isHungry = true;

	if (isHungry == true) 
	{
		cout << "Preparing snack..." << endl;
		cout << "Eating..." << endl;
	}
	else
	{
		cout << "I'm not hungry" << endl;
	}
	cout << "Sitting on the couch.." << endl;

	int x = 9;
	int y = 7;

	cout << "Is x greater than y?" << (x > y) << endl;
	cout << "Is x greater than OR equal to y? " << (x >= y) << endl;
	cout << "Is x less than y " << (x < y) << endl;

	bool wearingSocks = true;
	if (!wearingSocks)
	{
		cout << "Get some socks on!" << endl;
	}
	else
	{
		cout << "You already have socks" << endl;
	}
}
