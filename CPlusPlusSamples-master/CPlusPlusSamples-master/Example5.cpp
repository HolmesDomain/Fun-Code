//Chapter 6 of "Learning C++"
#include<iostream>
using namespace std;
int main() 
{
	
	
	return 0;
}
struct player
{
private:
	//fields
	string name;
	int hp;
	int armorClass;

	player(string nam,int h) 
	{
		this->name = nam;
		this->hp = h;

	}
	//Destructor
	~player() 
	{
		cout << "Player destroyed" << endl;
	}

	//A member function is a function declared in a struct/class
	void damage(int amount)
	{
		hp -= amount;
	}
	void damage(int dmgAmount)
	{
		hp -= dmgAmount - armorClass;
	}
public:
};
//Class = all members default private
//Struct = all memebers default public
//DIff. from Java
class player //class or struct? Options.
{
private:
	string name;
public: 
	string getName() 
	{
		return this->name;
	}
	string setName(string name) 
	{
		this->name = name;
	}
};
