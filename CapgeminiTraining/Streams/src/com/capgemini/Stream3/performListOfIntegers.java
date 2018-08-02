package com.capgemini.Stream3;


import java.util.function.Predicate;

public class performListOfIntegers {
public static Predicate<Integer> isEven()
{
	Predicate<Integer> predicate=i ->{
       return ((i%2==0)?true:false);
	};

return predicate;
}
public static Predicate<Integer> isOdd()
{
	Predicate<Integer> predicate=i ->{
return		(i%2==0)?false:true;
	};

return predicate;
}
public static Predicate<Integer> isDivisibleBy6()
{
	Predicate<Integer> predicate=i ->{
return		(i%6==0)?true:false;
	};

return predicate;
}
public static Predicate<Integer> isLessThan12()
{
	Predicate<Integer> predicate=i ->{
return		(i<12)?true:false;
	};

return predicate;
}
public static Predicate<Integer> isGreaterThan50()
{
	Predicate<Integer> predicate=i ->{
return		(i>50)?true:false;
	};

return predicate;
}
}
