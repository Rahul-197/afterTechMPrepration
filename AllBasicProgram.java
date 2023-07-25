package com.StudyStart.Interview.AfterTechM;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllBasicProgram 
{

	public static void main(String[] args) 
	{
		//	 ReverseString("hello");
		//	 String str =  "i am umesh patidar";
		//	 ReverseStringWithoutLoop(str,str.length()-1);
		//	 SumOfEvenNoInArray();
		//	 isPrime(15);
		//	 sumOfPrimeNumber(15);
		//	 printEvenNumberByStream(50);
		//	 PrintPrimeNumber(20);
			 /*print employee name who's salary less then 7 */
		//	 EmployeeSalaryLessThen();
		//	 SecondHighestSalaryFromEmployee();
		//	SecondHighestSalaryWithStream();	
		//	febonacciSeries();
		//	febonacciSeriesByJava8();
		//	armstrongNumber();
		
		//	customizeSortingByComprator();
		//	descendingOrderBySalary();
		//  sortMapByJava8();
		 //   get3HighestSalryEmploye();
		 //   fatchLessThenTop3HighestSalary();
		 //     diffMapAndFlatMap();
     	 //	countOccurencesOfStringInList();
		//	occuranceEachWordInString();
		//	occurenceEmploye();
		//	removeDuplicateCharString();
		//	removeDuplicateCharacterByjava8();
	
		//	findAllDuplicateCharInString();
		//	integerArraysSumOfTwoDigit();
     		 PracticePurpose("hello");
     		//System.out.println(st);
	}
	
	private static void PracticePurpose(String str) 
	{	
		int i =101010011;
		String st ="";int st1=10;
		while(i !=0)
		{
			int j=i%10;
			if(j==0)
			{
				st +=j;
			}else {
				st1+=1;
			}
			
			i=i/10;
		}
		System.out.println(st+st1);//output 000011111
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static void integerArraysSumOfTwoDigit() {
		int  ar[] ={1,2,3,4,-5,7,6,8,9};//6
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j =i;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==6)
				{
					System.out.println(ar[i]+" + "+ar[j]+" = 6");
				}
			}
		}
	}



	private static List<Employee> getEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		/*
		 * list.add(new Employee(1, 5, "a")); list.add(new Employee(3, 15, "b"));
		 * list.add(new Employee(5,11, "c")); list.add(new Employee(7, 2, "a"));
		 * list.add(new Employee(2, 1, "h")); list.add(new Employee(5,7, "g"));
		 */
			
			list.add(new Employee(1, 5, "abchd",new Address(100,"btm"),"male"));
			list.add(new Employee(3, 15, "gdhdssdssd",new Address(105,"abtm5"),"male"));
			list.add(new Employee(5,11, "b",new Address(103,"dbtm3"),"female"));
			list.add(new Employee(7, 12, "a",new Address(101,"hoskote"),"female"));
			list.add(new Employee(2, 12, "h",new Address(104,"hoskote"))); 
			list.add(new Employee(5,1, "g",new Address(106,"btm"))); 
			list.add(new Employee(8, 12,"a",new Address(104,"hoskote"))); 
			list.add(new Employee(5,12, "g",new Address(106,"hoskote")));
			 
			return list;
		}
	

	/* duplicate char in string */
	private static void findAllDuplicateCharInString() {
		String str ="hellheeepom";
		str.chars().mapToObj(t->(char)t).collect(Collectors.
				groupingBy(t->t,Collectors.counting())).entrySet().stream().
		filter(t->t.getValue()>1).forEach(t->System.out.println(t.getKey()+" : "+t.getValue()));;
		System.out.println();
	}	
	/*Remove duplicate char in string*/
	private static void removeDuplicateCharacterByjava8() {
		String str = "hellohellohellohellop";
		StringBuilder l =str.chars().distinct().collect(StringBuilder :: new, StringBuilder :: appendCodePoint, StringBuilder::append);
		System.out.println(l);	
	}
	/* remove duplicate char in string */
	private static void removeDuplicateCharString() {
		String str ="hellohellp";
		String[] arrStr = str.split("");
		String newStr ="";
		for(int i=0;i<str.length();i++)
		{
			CharSequence ch =arrStr[i];
			if(newStr.contains(ch))
			{
				continue;
			}
			else
			{
				newStr+=arrStr[i];
			}
		}
		System.out.println(newStr);
	}
	
	/* Occurrences in string each word count*/
	private static void occuranceEachWordInString() {
		String str ="helloHelloword";
		Map mp =str.chars().mapToObj(t->(char)t).collect(Collectors.groupingBy(t->t,Collectors.counting()));
		System.out.println(mp);
		
	}

	/* how many time employee occurring by name  */
	private static void occurenceEmploye() {
		List<Employee> listemp = getEmployee();
		Map occurenceEmpByName = listemp.stream().collect(Collectors.groupingBy(t->t.getName(),Collectors.counting()));
		System.out.println(occurenceEmpByName);
		
		//====================================By Address ===========================
		
		Map<Object, Long> l =listemp.stream().collect(Collectors.groupingBy(t->t.getAddress().getAddress(),Collectors.counting()));
		System.out.println(l);
	}


	
	/* neoSoft technology mumbai -1   Occrence list string */
	private static void countOccurencesOfStringInList() {
		
		List<String> list = Arrays.asList("shyam","ram","aman","ram","mahadev","shyam");
		Map<Object, Long> mapOccurences = list.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()));
		
		System.out.println(mapOccurences);
	}
	
	private static void diffMapAndFlatMap() {
		/* ********************Using Map=> is used to transfer each element individually ****************/  
		List<Integer> l = List.of(1,2,3,4,5,6,7);
		List<Integer> l1 = l.stream().map(t->(t*5)).collect(Collectors.toList());
		System.out.println(l1);
		/* ********************Using FlatMap => list of list to single list used to map and flatten map stream of it convert stream to single stream****************/  
		List<List<Integer>> nestedList = List.of(List.of(1,2),List.of(3,4),List.of(5,6));
		List<Integer> list =nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(list);
		
	}
	
	/* fatch all employees having salary  less then 3rd highest salary */
	private static void fatchLessThenTop3HighestSalary() {
		
		List<Employee> listEmp = getEmployee();
		List l =listEmp.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).skip(3).collect(Collectors.toList());
		System.out.println(l);
	}
	
	/*  =============== fatch top 3 highest salry employee */
	private static void get3HighestSalryEmploye() {
		
		List<Employee> empList = getEmployee();
		List l =empList.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).limit(3).collect(Collectors.toList());
		System.out.println(l);
		
	}

	
	private static void sortMapByJava8() {
		 Map<String, Integer> map = new HashMap<>();
	        map.put("John", 10);
	        map.put("Alice", 3);
	        map.put("Bob", 16);
	        map.put("Sarah", 4);
	        System.out.println("==============================sory map by value descending order==================");
	        map.entrySet().stream().sorted((o1,o2)->o2.getValue()-o1.getValue()).forEach(entry->System.out.println(entry));		
	        
	        System.out.println("===============================sory map by key descending order==================");
	        map.entrySet().stream().sorted((o1,o2)->o2.getKey().compareTo(o1.getKey())).forEach(entry->System.out.println(entry));		  
	}
	
private static void descendingOrderBySalary()
	{
			
		List<Employee> empList = getEmployee();
//		System.out.println("============================Sort By Address Descending Order ======================");
//		List desclist =empList.stream().sorted((o1,o2)->(o1.getAddress().getAddress().compareTo(o2.getAddress().getAddress()))).collect(Collectors.toList());
//		System.out.println(desclist);
		System.out.println("============================sort by name Descending order whos salary is less then 15 and belongs to hoskote ========================");
		List l =empList.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).filter(o1-> o1.getAddress().getAddress()=="hoskote").collect(Collectors.toList());
		System.out.println(l);
	}

	private static void customizeSortingByComprator() 
	{ 
		List<Employee> list = new ArrayList<Employee>();
		
	
		list.add(new Employee(1, 5, "a",new Address(100,"btm")));
		list.add(new Employee(3, 15, "b",new Address(105,"btm")));
		list.add(new Employee(5,11, "c",new Address(103,"hoskote")));
		list.add(new Employee(7, 2, "a",new Address(101,"hoskote")));
		list.add(new Employee(2, 1, "h",new Address(104,"cbtm4")));
		list.add(new Employee(5,7, "g",new Address(106,"hoskote6")));
		
		list.sort(Comparator.comparing(Employee::getName).reversed());
		System.out.println();
		System.out.println("=====================by address ========================");
		Collections.sort(list, new AddressComprator());
		System.out.println(list);
		System.out.println("=====================by pincode ========================");
		Collections.sort(list,new PincodeComprator());
		System.out.println(list);
	}
	
	
	
	private static void armstrongNumber() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Number");
		int inNum = sc.nextInt();
		int Number=inNum,in =inNum,count=0;
		while(Number !=0)
		{
			count++;
			Number = Number/10;
		}
		int countNum = 0;
		while(in != 0)
		{
			int num = in%10;
			int NumSum =1;
			for(int i =1;i<=count;i++)
			{
				NumSum = NumSum*num;
			}
			countNum =countNum+NumSum;
			NumSum =1;
			in = in/10;
			
		}

		if(countNum == inNum)
		{
			System.out.println(inNum +" : No is Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	
	}

	private static void febonacciSeriesByJava8() {
	       System.out.println("Fibonacci Series:");
	      Stream.iterate(new int[]{0,1}, t->new int[] {t[1],t[0]+t[1]})
	      .limit(10)
	      .forEach(feb->System.out.print(feb[0]+" , "));
	 
	}

	private static void febonacciSeries() {
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum = 0;
		for(int i=1;i<=10;i++)
		{
			thirdNum = firstNum+ secondNum;
			System.out.print(thirdNum+" , ");
			firstNum = secondNum;
			secondNum = thirdNum;
		}
		
	}

	private static void SecondHighestSalaryWithStream() {
		List<Employee> l = getEmployee();
		int i = 
				
		l.stream() 
		.map(Employee :: getSalary) //extract the salary
		.distinct() //remove duplicate if any
		.sorted(Comparator.reverseOrder())  //sort in desecnding order
		.skip(1) //skip the highest salary
		.findFirst()  //get the first element  	
		.orElse(null);  // handle empty list case
		System.out.println(i);
	}

	private static void SecondHighestSalaryFromEmployee() {
	
	  List<Employee> l = getEmployee(); 
	  double highest=0; double secondHighest = 0;
	  
	  for(Employee l1 : l) 
	  { 
		  if(l1.getSalary()>highest) 
			{ 
			  secondHighest = highest;
			  highest = l1.getSalary(); 
			 } 
		    else if(l1.getSalary()>secondHighest &&l1.getSalary() != highest) 
		   { 
		    	secondHighest = l1.getSalary(); 
		   } 
	 }
	  		System.out.println(secondHighest);
	 
		
	}

	private static void EmployeeSalaryLessThen() {
		
		List<Employee> l  = getEmployee();
		List l2 =l.stream().filter(t->t.getSalary()<7).collect(Collectors.toList());
		System.out.println("salry : "+l2);		
	}

	private static void  PrintPrimeNumber(int n) {
		List l =IntStream.rangeClosed(2, n).filter(x->isPrimeWithStream(x)).boxed().collect(Collectors.toList());
		System.out.println("Print Prime Nubmer : "+l);
		int l2 =IntStream.rangeClosed(2, n).filter(x->isPrimeWithStream(x)).sum();
		System.out.println("sum of prime Number : "+l2);
		int sum = 0;
		IntStream.rangeClosed(2, n).filter(x->isPrimeWithStream(x)).forEach(c->System.out.print(c+" , "));
	}
	private static boolean isPrimeWithStream(int x) {
		
		return x>1 && IntStream.range(2, x).noneMatch(i->x%i==0);	
	}

	private static void printEvenNumberByStream(int n) {
		List l =IntStream.rangeClosed(2, n).filter(x->x%2==0).boxed().collect(Collectors.toList());
		System.out.println(l);
	}

	private static void sumOfPrimeNumber(int in) 
	{ 
		int sum =0;
		for(int i = 1;i<=in;i++)
		{
			 boolean b =isprimeNum(i);
			 if(!b)
			 {
				 System.out.println(i);
				 sum +=i;
			 }
		}
		System.out.println("Sum : "+sum);
	}
	
	private static boolean isprimeNum(int in) {
		
		boolean flag = false;
		for(int i =2;i<in;i++)
		{
			if(in%i==0)
			{
				 flag=true;
				 break;
			}
		}
		return flag;
	}

	private static void isPrime(int in)
	{
		
		 int num = in;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) 
		    {
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }
		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  
	}

	private static void SumOfEvenNoInArray() 
	{
		int [] arr = {1,4,12,3,5,7,6,3,2,9};
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}

	private static void ReverseStringWithoutLoop(String input, int length) {
		if(length>=0)
		{
			System.out.print(input.charAt(length));
			ReverseStringWithoutLoop(input, length-1);
		}
	
	}
	private static String ReverseString(String str)
	{
		String newReverse ="";
		for (int i = str.length()-1; i>=0 ; i--) {
			newReverse +=str.charAt(i);
		}
		System.out.println(newReverse);
		
		if(str.length()==0)return "";
		return str.charAt(str.length()-1)+ReverseString(str.substring(0,str.length()-1));

	}	
	
}
