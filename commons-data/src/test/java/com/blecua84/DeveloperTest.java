package com.blecua84;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * Test class for Developer class.
 *
 * @author blecua84
 */
public class DeveloperTest {

    private static final String classname = "com.blecua84.Developer";

    private Class getClassDefined() {
        Class classToReturn = null;

        try {
            classToReturn = Class.forName(classname);
        } catch (ClassNotFoundException e) {}

        return classToReturn;

    }

    private Field getFieldByClass(String field) {
        Field fieldToReturn = null;
        Class classTest = getClassDefined();

        if(classTest != null) {

            try {
                fieldToReturn = classTest.getDeclaredField(field);
            } catch (NoSuchFieldException e) {}

        }
        return fieldToReturn;

    }

    private Method getMethod(String method, Class... parameters) {
        Class developer = getClassDefined();
        Method methodResult = null;

        try {
            methodResult = developer.getDeclaredMethod(method, parameters);
        } catch (NoSuchMethodException e) {}

        return methodResult;
    }

    @Test
    public void existClass() {
        Class developer = getClassDefined();

        Assert.assertNotNull(developer);
    }

    @Test
    public void existFieldCalledName() {
        Field nameField = getFieldByClass("name");

        Assert.assertNotNull(nameField);
    }

    @Test
    public void fieldCalledNameIsString() {
        Field nameField = getFieldByClass("name");

        Assert.assertTrue(nameField.getType().equals(String.class));
    }

    @Test
    public void existFieldCalledSalary() {
        Field salaryField = getFieldByClass("salary");

        Assert.assertNotNull(salaryField);
    }

    @Test
    public void fieldCalledSalaryIsBigDecimal() {
        Field salaryField = getFieldByClass("salary");

        Assert.assertTrue(salaryField.getType().equals(BigDecimal.class));
    }

    @Test
    public void existFieldCalledAge() {
        Field ageField = getFieldByClass("age");

        Assert.assertNotNull(ageField);
    }

    @Test
    public void fieldCalledAgeIsInteger() {
        Field ageField = getFieldByClass("age");

        Assert.assertTrue(ageField.getType().equals(Integer.class));
    }

    @Test
    public void existsMethodCalledGetName() {
        Method method = getMethod("getName");

        Assert.assertNotNull(method);
    }

    @Test
    public void methodCalledGetNameReturnString() {
        Method method = getMethod("getName");

        Assert.assertTrue(method.getReturnType().equals(String.class));
    }

    @Test
    public void existsMethodCalledSetName() {
        Method method = getMethod("setName", String.class);

        Assert.assertNotNull(method);
    }

    @Test
    public void methodCalledSetNameHasOnlyOneImputParameter() {
        Method method = getMethod("setName", String.class);

        Assert.assertTrue(method.getParameters().length == 1);
    }

    @Test
    public void methodCalledSetNameHasVoidReturnValue() {
        Method method = getMethod("setName", String.class);

        Assert.assertTrue(method.getReturnType().getName().equals("void"));
    }

    @Test
    public void existsMethodCalledGetSalary() {
        Method method = getMethod("getSalary");

        Assert.assertNotNull(method);
    }

    @Test
    public void methodCalledGetSalaryHasNotInputParameters() {
        Method method = getMethod("getSalary");

        Assert.assertTrue(method.getParameterCount() == 0);
    }

    @Test
    public void methodCalledGetSalaryReturnsBigDecimal() {
        Method method = getMethod("getSalary");

        Assert.assertTrue(method.getReturnType().equals(BigDecimal.class));
    }

    @Test
    public void existsMethodCalledSetSalary() {
        Method method = getMethod("setSalary", BigDecimal.class);

        Assert.assertNotNull(method);
    }

    @Test
    public void methodCalledSetSalaryHasOnlyOneImputParameter() {
        Method method = getMethod("setSalary", BigDecimal.class);

        Assert.assertNotNull(method);
        Assert.assertTrue(method.getParameters().length == 1);
    }

    @Test
    public void methodCalledSetSalaryHasVoidReturnValue() {
        Method method = getMethod("setSalary", BigDecimal.class);

        Assert.assertNotNull(method);
        Assert.assertTrue(method.getReturnType().getName().equals("void"));
    }

    @Test
    public void existsMethodCalledGetAge() {
        Method method = getMethod("getAge");

        Assert.assertNotNull(method);
    }

    @Test
    public void methodCalledGetAgeHasNotInputParameters() {
        Method method = getMethod("getAge");

        Assert.assertTrue(method.getParameterCount() == 0);
    }

    @Test
    public void methodCalledGetAgeReturnsInteger() {
        Method method = getMethod("getAge");

        Assert.assertTrue(method.getReturnType().equals(Integer.class));
    }

    @Test
    public void existsMethodCalledSetSAge() {
        Method method = getMethod("setAge", Integer.class);

        Assert.assertNotNull(method);
    }

    @Test
    public void methodCalledSetAgeHasOnlyOneImputParameter() {
        Method method = getMethod("setAge", Integer.class);

        Assert.assertNotNull(method);
        Assert.assertTrue(method.getParameters().length == 1);
    }

    @Test
    public void methodCalledSetAgeHasVoidReturnValue() {
        Method method = getMethod("setAge", Integer.class);

        Assert.assertNotNull(method);
        Assert.assertTrue(method.getReturnType().getName().equals("void"));
    }

    @Test
    public void existMethodToString() {
        Method method = getMethod("toString");

        Assert.assertNotNull(method);
    }

    @Test
    public void methodCalledToStringHasNotInputParameters() {
        Method method = getMethod("toString");

        Assert.assertTrue(method.getParameterCount() == 0);
    }

    @Test
    public void methodCalledToStringReturnsInteger() {
        Method method = getMethod("toString");

        Assert.assertTrue(method.getReturnType().equals(String.class));
    }
}
