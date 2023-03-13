package JavaProfessionalCourseHomeWork.HomeWork15.Level2.Exercise2;
/*
2. Представьте что есть итератор по символам слова Iterator<Character> charIterator Есть итератор по словам в
предложении Iterator<String> wordIterator напишите итератор для прохода по итератору Iterator<Character> wordSymbolsIterator
который проходится поочередно по всем символам слов суть итератора такова:
- под капотом будет 2 итератора
- сначала идем по итератору слов
- после для каждого слова применяем итератор букв Например:

String str = "Мама мыла раму";
Iterator<Character> wordSymbolsIterator = new wordSymbolsIterator(str);
while(wordSymbolsIterator.hasNext()) {
    System.out.println(wordSymbolsIterator.next());
}
 */
public class IteratorTest {
    public static void main(String[] args) {
        WordSymbolsIterator iterator = new WordSymbolsIterator("Mama мыла раму");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
