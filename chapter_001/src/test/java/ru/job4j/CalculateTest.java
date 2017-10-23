package ru.job4j;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Daniil Ivanov (mailto:fatbowl29@yandex.ru)
* @version 2
* @since 19.10.2017
*/
public class CalculateTest {
/**
* Test echo.
* @Test
*/
public void whenTakeNameThenThreeEchoPlusName() {
String input = "Daniil Ivanov";
String expect = "Echo, echo, echo : Daniil Ivanov";
Calculate calc = new Calculate();
String result = calc.echo(input);
assertThat(result, is(expect));
 }
 }