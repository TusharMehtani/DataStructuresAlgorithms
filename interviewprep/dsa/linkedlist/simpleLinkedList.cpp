#include<iostream>
using namespace std;

struct Node{
		int data;
		Node *next;
	};

int main(){
	Node *head = NULL;
	Node *second = NULL;
	Node *third = NULL;

	head = new Node;
	second = new Node;
	third = new Node;

	head->data = 1;
	head->next = second;

	second->data = 2;
	second->next = third;

	third->data = 3;
	third->next = NULL;

	cout<<head->data<<"\n";
	cout<<second->data<<"\n";
	cout<<third->data<<"\n";

	cout<<head->next<<"\n";	
	cout<<second->next<<"\n";
	cout<<third->next<<"\n";


	cin.get();
	return 0;
}
