#include <iostream>

using namespace std;



class Animal
{
public:
//void eat() { std::couytt << "I'm eating generic food.\n"; }
virtual void eat() { std::cout << "I'm eating generic food.\n"; }
};

class Cat : public Animal
{
public:
void eat() { std::cout << "I'm eating a rat.\n"; }
};

void func(Animal *xyz) { xyz->eat(); }

int main(int argc, char *argv[]) {
	Animal *animal = new Cat;
	Cat *cat = new Cat;
	
	animal->eat(); // outputs: "I'm eating generic food."
	cat->eat(); // outputs: "I'm eating a rat."
	
	func(animal); // outputs: "I'm eating generic food."
	func(cat); // outputs: "I'm eating generic food."
}