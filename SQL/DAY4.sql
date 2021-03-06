--DAY 4 LAB PRACTICE

--EX1 - USE AGGREGATE FUNCTIONS

DECLARE
 MAX_SAL NUMBER(5);
 MIN_SAL NUMBER(5);
 AVG_SAL NUMBER(5);
 COM_PCT_COUNT NUMBER(5);
BEGIN
    select max(salary),MIN(salary),AVG(SALARY),COUNT(commission_pct) INTO MAX_SAL , MIN_SAL , AVG_SAL, COM_PCT_COUNT from employees  
    WHERE DEPARTMENT_ID = 80;
    DBMS_OUTPUT.put_line(MAX_SAL ||'-'|| MIN_SAL ||'-'|| AVG_SAL ||'-'|| COM_PCT_COUNT);
END;

-- EX2 - EMPLOYEE GRADING

DECLARE
    EMP_ID NUMBER(5);
    EMP_SAL employees.salary%TYPE;
    FNAME employees.first_name%TYPE ;
    GRADE CHAR(1);
BEGIN
    SELECT FIRST_NAME , SALARY INTO FNAME , EMP_SAL FROM EMPLOYEES WHERE EMPLOYEE_ID = &EMP_ID;
    GRADE := 
        CASE 
            WHEN EMP_SAL > 20000 THEN 'A'
            WHEN EMP_SAL BETWEEN 20000 AND 10000 THEN 'B'
            ELSE 'C'
        END;
     DBMS_OUTPUT.PUT_LINE('HI '||FNAME ||' , YOUR GRADE IS '||GRADE);
END;

-- EX3 - PRINT IN REVERSE

BEGIN
FOR IN_VAR IN REVERSE 1..10  LOOP
    DBMS_OUTPUT.PUT_LINE('->'|| IN_VAR);
END LOOP;
END;   


-- EX4 - PROCEDURE 
--PROCEDURE START
    CREATE OR REPLACE PROCEDURE PRC_INSERT(REGNAME IN VARCHAR2) AS
    REGID NUMBER;
    BEGIN
        SELECT MAX(REGION_ID) INTO REGID FROM REGIONS;
        INSERT INTO REGIONS VALUES(REGID+1 , REGNAME);
    END;
--PROCEDURE END
CREATE TYPE NAMEARRAY IS VARRAY(3) OF VARCHAR(20);
/
DECLARE
    NAMES NAMEARRAY;
BEGIN
    NAMES := NAMEARRAY('ANTARTICA', 'AUSTRALIA','NEWCONT');
    FOR IN_VAR IN 1..3 LOOP
        PRC_INSERT(NAMES(IN_VAR));
    END LOOP;    
END ;



/