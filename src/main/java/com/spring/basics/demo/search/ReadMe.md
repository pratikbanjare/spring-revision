The code snippent here elaborates bean management by spring

@Component tells spring to manage bean of the class 

@Autowired tells spring to search in its application context, for bean.

There are 2 conflicting beans for SortingAlgorithm instance in BinarySearchImpl

@Qualifier is used to distinguish between the bean to be applied, tacking bean conflict

@Scope("prototype") is telling spring to create a new instance every time bean of BinarySearchImpl is requested.


