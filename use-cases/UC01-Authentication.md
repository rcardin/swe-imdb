# UC01 - Internal user authentication

As a generic user, I want to authenticate myself, using my username and password, so that I can access the system.

**Main Actor**: Generic User  
**Preconditions**: The system does not recognize the user  
**Post-conditions**: The system recognized the user  
**Main Scenario**:  
1. (UC06) The user inserts her username
2. (UC09) The user inserts her password
3. The user must fulfill a CAPTCHA

**Includes**:  
* UC09

**Alternative Scenario**:
1. (UC07) The user gives bad credentials, and the system displays an error

**Inherits from**:
* UC06

