#include<iostream>
#include<string>
using namespace std;

struct Vector  //begin defiition
{
	float x, y, z; //posiions floats
}; //end vector object definition

int main() 
{
	string name;
	int goldPieces;
	float hp;
	int answer;
	name = "William";
	goldPieces = 322;
	hp = 75.5f; //hit points are decimal valued
	cout << "Character " << name << " has " << hp << " hp and " << goldPieces << " gold.";
	answer = 277 + 5 * 4 / 2 + 20;

	Vector v;
	v.x = 20, v.y = 30, v.z = 40;
	cout << "Display vector values"<< endl;

	int *px; //Pointers! 
	px = &answer;

	cout << &answer <<" and its reference " << *px << endl; //Differencing px

	//Learn cin!
	cout << "what is your name?" << endl;
	string name;
	cin >> name;

	//PrintF Mayne! 
	char character = 'A';
	int integer = 1;
	printf("integer %d, character %c/n", integer, character);
}
