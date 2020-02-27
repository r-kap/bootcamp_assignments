package healthycoderapp;

import com.sun.org.apache.bcel.internal.classfile.Code;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void fixMe(){
        assertTrue(true);
    }

    @Test
    void should_ReturnTrue_When_DietRecommended() {

        //given
        double weight = 89.0;
        double height = 1.2;

        //when
        boolean result = BMICalculator.isDietRecommended(weight, height);

        //then
        assertTrue(result);
    }

    @Test
    void should_ReturnFalse_When_DietNotRecommended() {

        //given
        double weight = 59.0;
        double height = 1.92;

        //when
        boolean result = BMICalculator.isDietRecommended(weight, height);

        //then
        assertFalse(result);
    }

        @Test
        void should_ThrowArithmeticException_When_HeightZero() {

            //given
            double weight = 89.0;
            double height = 0;

            //when
            Executable executable = () -> BMICalculator.isDietRecommended(weight, height);
            //then
            assertThrows(ArithmeticException.class, executable);
        }

        void shouldReturn_CoderWithWorstBMI_WhenCoderListNotEmpty(){

        //given
            List<Coder> coders= new ArrayList<>();
            coders.add(new Coder(1.80, 60.0));
            coders.add(new Coder(1.82, 98.0));
            coders.add(new Coder(1.82, 64.7));

            //when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

            //then
            assertAll(
                    ()-> assertEquals(1.82, coderWorstBMI.getHeight()),
                    ()-> assertEquals(98.0, coderWorstBMI.getHeight())
            );

        }

    @Test
    void should_Return_CoderwithworstBMI_whenlistNotEmpty(){
        List<Coder> coder = new ArrayList<>();
        //Given
        coder.add(new Coder(1.70,58));
        coder.add(new Coder(1.65,70));
        coder.add(new Coder(1.8,100));
        //when
        Coder coder_with_worstBMI = BMICalculator.findCoderWithWorstBMI(coder);
        //then
        assertAll(
                ()->  assertEquals(1.8,coder_with_worstBMI.getHeight()),
                ()->assertEquals(100,coder_with_worstBMI.getWeight())
        );

    }
    @Test
    void should_return_null_whenlistEmpty(){
        //given
        List<Coder> coder = new ArrayList<>();
        //when
        Coder coder_with_worstBMI = BMICalculator.findCoderWithWorstBMI(coder);
        //then
        assertNull(coder_with_worstBMI);
    }
    @Test
    void should_getBMIscores_whencoderlistnotempty()
    {
        //given
        List<Coder> coder = new ArrayList<>();
        coder.add(new Coder(1.8,98));
        coder.add(new Coder(1.75,80));
        double[] actual_BMI = new double[]{30.25,26.12};

        //when
        double[] list_coders = BMICalculator.getBMIScores(coder);


        //then
        assertArrayEquals(actual_BMI,list_coders);

    }


}