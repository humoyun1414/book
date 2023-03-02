# Getting Started


### Java Naming Conventions

Java naming conventions are sort of guidelines that application programmers are expected to follow to produce consistent
and readable code throughout the application. If teams do not follow these conventions, they may collectively write an
application code that is hard to read and difficult to understand.

Java heavily uses Camel Case notations for naming the methods, variables etc. and TitleCase notations for classes and
interfaces.

1. <b>Naming Packages</b>
   <br>
   Package names must be a group of words starting with all lowercase domain names (e.g. com, org, net, etc). Subsequent
   parts of the package name may be different according to an organization’s own internal naming conventions:
   ```java
    package com.example.webapp.controller; 

    package com.company.myapplication.web.controller;

    package com.google.search.common;
   ```

2. <b>Naming Classes</b>
   <br>
   In Java, class names generally should be nouns, in title-case with the first letter of each separate word
   capitalized. e.g.
   ```java
    public class User {}

    public class Employee {}

    public class RecordService {}

    public class AdvancedProductRepositoryImpl {}
   ```

3. <b>Naming Interfaces</b>
   <br>
   In Java, interfaces names, generally, should be adjectives. Interfaces should be in the title case with the first
   letter of each separate word capitalized. In some cases, interfaces can be nouns as well when they present a family
   of classes e.g. List and Map:
   ```java
    public interface Serializable {}

    public interface Cloneable {}

    public interface Iterable {}

    public interface LazyList {}

    public interface ConcurrentHashMap {}
   ```

4. <b>Naming Methods</b>
   <br>
   Methods always should be verbs. They represent action and the method name should clearly state the action they
   perform. The method name can be single or 2-3 words as needed to clearly represent the action. Words should be in
   camel case notation:
      ```java
       public Long getId() {}

       public void remove(final Object o) {}

       public Object update(final Object o) {}

       public Report findReportById(final Long id) {}

       public Report findProductByName(final String name) {}
      ```

   Also note that methods in a class should be sorted by visibility and alphabetically by names, e.g.
    1. All <b>public</b> methods should be sorted alphabetically by method names
    2. All <b>protected</b> methods should be sorted alphabetically by method names
    3. All <b>package private</b> methods should be sorted alphabetically by method names
    4. All <b>private</b> methods should be sorted alphabetically by method names
       <br><br>

5. <b>Naming Variables</b>
   <br>
   All instance, static and method parameter variable names should be in camel case notation. They should be short and
   enough to describe their purpose. Temporary variables can be a single character e.g. the counter in the loops.
   Methods in a class should be sorted by visibility and alphabetically by names, e.g.
    1. All <b>public</b> methods should be sorted alphabetically by method names
    2. All <b>protected</b> methods should be sorted alphabetically by method names
    3. All <b>package private</b> methods should be sorted alphabetically by method names
    4. All <b>private</b> methods should be sorted alphabetically by method names
   ```java
    public Long id;

    public EmployeeDao employeeDao;
    
    private Properties properties;
    
    for (int i = 0; i < list.size(); i++) {
    
    }
   ```

   Also note that class variables should be sorted by visibility and alphabetically by names, e.g.
    1. All <b>public</b> variables should be sorted alphabetically by variable names
    2. All <b>protected</b> variables should be sorted alphabetically by variable names
    3. All <b>package private</b> variables should be sorted alphabetically by variable names
    4. All <b>private</b> variables should be sorted alphabetically by variable names
       <br><br>

6. <b>Naming Constants</b>
   <br>
   Java constants should be all <b>UPPERCASE</b> where words are separated by <b>underscore</b> character (“_”). Make
   sure to use the final modifier with constant variables.
   ```java
    public final String SECURITY_TOKEN = "...";

    public final int INITIAL_SIZE = 16;

    public final Integer MAX_SIZE = Integer.MAX;
   ```

7. <b>Naming Generic Types</b>
   <br>
   Generic type parameter names should be uppercase single letters. The letter <b>'T'</b> for type is typically
   recommended. In JDK classes, <b>E</b> is used for collection elements, S is used for service loaders, and <b>K</b>
   and <b>V</b> are used for map keys and values.
   ```java
    public interface Map <K,V> {}

    public interface List<E> extends Collection<E> {}

    Iterator<E> iterator() {}
   ```

8. <b>Naming Enums</b>
   <br>
   Similar to class constants, enumeration names should be all uppercase letters.
   ```java
    enum Direction {NORTH, EAST, SOUTH, WEST}
   ```

9. <b>Naming Annotations</b>
   <br>
   Annotation names follow title case notation. They can be adjectives, verbs, or nouns based on the requirements.
   ```java
    public @interface FunctionalInterface {}

    public @interface Deprecated {}
    
    public @interface Documented {}
    
    public @Async Documented {}
    
    public @Test Documented {}
   ```

### REST API Naming Conventions

There are 11 basic principles which should be followed for naming REST APIs:

1. <b>Use nouns for naming URIs</b>
   ```
   https://api.example.com/v1/users
   https://api.example.com/v1/users/{id}
   https://api.example.com/v1/products/discount
   ```
   All REST APIs have a URL at which they can be accessed, e.g. https://api.example.com. Subdirectories of this URL
   denote different API resources, which are accessed using an Uniform Resource Identifier (URI). For example, the
   URI https://api.example.com/v1/users will return a list containing the users of a particular service.
   <br><br>

2. <b>Do not use verbs for naming URIs</b>
   ```
   https://api.example.com/v1/users
   https://api.example.com/v1/reviews/{id}
   https://api.example.com/v1/offers/cancelled
   ```
   In general, URIs should be named with nouns that specify the contents of the resource, rather than adding a verb for
   the function that is being performed. For example, you should use https://api.example.com/v1/users instead
   of https://api.example.com/v1/getUsers. This is because CRUD (Create, Read, Update, Delete) functionality should
   already be specified in the HTTP request (e.g. HTTP GET https://api.example.com/v1/users).
   <br><br>

3. <b>Prefer pluralized resources</b>
   ```
   https://api.example.com/v1/products
   https://api.example.com/v1/orders
   https://api.example.com/v1/users/admin
   ```
   Using nouns for naming URIs is a REST API naming best practice, but when should you use singular or plural nouns? In
   general, using plural nouns is preferred unless the resource is clearly a singular concept (
   e.g. https://api.example.com/v1/users/admin for the administrative user).
   <br><br>

4. <b>Use intuitive (no jargon), clear, unabridged names</b>
   ```
   https://api.example.com/v1/users/{id}/first-name
   https://api.example.com/v1/companies/{id}/address
   https://api.example.com/v1/orders/approved
   ```
   When naming REST API endpoints, you should use URI names that are intuitive and clear—ideally, something that third
   parties could guess even if they’ve never used your API before. In particular, avoid abbreviations and shorthand (
   e.g. https://api.example.com/users/123/fn instead of https://api.example.com/users/123/first-name)—unless that
   abbreviation is the preferred or most popular term, in which case feel free to use it (
   e.g. https://api.example.com/users/ids instead of https://api.example.com/users/identification-numbers).
   <br><br>

5. <b>Use forward slashes to denote URI hierarchy</b>
   ```
   https://api.example.com/v1/users/{id}/username
   https://api.example.com/v1/companies/{id}
   https://api.example.com/v1/products/sold
   ```
   REST APIs are typically structured in a hierarchy: for example, https://api.example.com/users/123/first-name will
   retrieve the first name of the user with ID number 123. The forward slash (“/”) character should be used to navigate
   this hierarchy, moving from general to specific when going from left to right in the URI.
   <br><br>

6. <b>Do not use trailing forward slash</b>
   ```
   https://api.example.com/v1/users
   https://api.example.com/v1/orders/{id}
   https://api.example.com/v1/products
   ```
   While forward slashes are good for denoting the hierarchy of your API, they’re not necessary at the very end of the
   URL, where they add complexity without adding clarity. For example, you should use https://api.example.com/users
   instead of https://api.example.com/users/.
   <br><br>

7. <b>Separate words with hyphens instead of underscores</b>
   ```
   https://api.example.com/v1/users/{id}/first-name
   https://api.example.com/v1/products/on-sale
   ```
   When a REST API endpoint contains multiple words (e.g. https://api.example.com/users/123/first-name), you should
   separate the words using hyphens. This is typically clearer and more user-friendly than using underscores (e.g.
   first_name) or camel case (e.g. firstName), which is discouraged due to its use of capital letters (see below).
   <br><br>

8. <b>Use lowercase letters instead of camelCase and CAPITAL letters</b>
   ```
   https://api.example.com/v1/users/{id}/first-name
   https://api.example.com/v1/products/on-sale
   ```
   Whenever possible, use lowercase letters in your API URLs. This is mainly because
   the [RFC 3986 specification for URI standards](https://tools.ietf.org/html/rfc3986) denotes that URIs are
   case-sensitive (except for the scheme and host components of the URL). Lowercase letters for URIs are in widespread
   use, and also help avoid confusion about inconsistent capitalization.
   <br><br>

9. <b>Use query parameters where necessary</b>
   ```
   https://api.example.com/v1/users?location=USA
   https://api.example.com/v1/products?name=iPhone
   https://api.example.com/v1/companies?name=Apple
   ```
   In order to sort or filter a collection, a REST API should allow query parameters to be passed in the URI.
   <br><br>

10. <b>Avoid special characters</b>
   ```
   https://api.example.com/v1/reviews
   https://api.example.com/v1/companies/{id}
   https://api.example.com/v1/stores/inactive
   ```

Special characters are not only unnecessary, they can also be confusing for users and technically complex. Because URLs
can only be sent and received using the ASCII character set, all of your API URLs should contain only ASCII characters.
<br><br>

In addition, try to avoid the use of “unsafe” ASCII characters, which are typically encoded in order to prevent
confusion and security issues (e.g. “%20” for the space character). “Unsafe” ASCII characters for URLs include the space
character (“ “), as well as brackets (“[]”), angle brackets (“<>”), braces (“{}”), and pipes (“|”).
<br><br>

11. <b>Avoid file extensions</b>
    ```
    https://api.example.com/v1/users
    https://api.example.com/v1/files/{id}
    https://api.example.com/v1/images/sold
    ```
    While the result of an API call may be a particular filetype, file extensions are largely seen as unnecessary in
    URIs—they add length and complexity. For example, you should use https://api.example.com/users instead
    of https://api.example.com/users.xml. In fact, using a file extension can create issues for end users if you change
    the filetype of the results later on.
    <br><br>

    If you want to specify the filetype of the results, you can use
    the [Content-Type entity header](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Type) instead.

### Liquibase naming convention
All Liquibase related changes must be under `db.migration` folder and all database related change files should be under `changelog` folder which in turn is located be under `db.migration`. The master change log file name should be left as default which is `db.changelog-master.yml`.

The change file format should be as follows: `yyyymmdd-seq_number-<description>`

Here is a sample on how Liquibase folders and files structure should look like:
```
src
└───main
│   └───resources
│       └───db.migration
│           └───changelog
│               ├──20221020-00-create-tables.xml
│               ├──20221020-01-seeds.xml
│               ├──20221025-00-update-price.xml
│           ├──db.changelog-master.yml
```



### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.3/gradle-plugin/reference/html/#build-image)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#web.reactive)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#data.sql.r2dbc)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Accessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [R2DBC Homepage](https://r2dbc.io)

