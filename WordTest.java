@Test
public void getName_returnsName_true() {
  Word testWord = new Word("Home");
  assertEquals("Home", testWord.getName());
}

@Test
public void getId_returnsWordId() {
  Word testWord = new Word("Home");
  assertTrue(Word.all().size() == testWord.getId());
}

@Test
public void getWords_initiallyReturnsEmptyArrayList() {
  Word testWord = new Word("Home");
  assertTrue(testWord.getWords() instanceof ArrayList);
}

@Test
public void all_returnsAllInstancesOfWord_true() {
  Word firstWord = new Word("Home");
  Word secondWord = new Word("Home");
  assertTrue(Word.all().contains(firstWord));
  assertTrue(Word.all().contains(secondWord));
}

@Test
public void clear_removesAllWordInstancesFromMemory() {
  Word testWord = new Word("Home");
  Word.clear();
  assertEquals(Word.all().size(), 0);
}

@Test
public void find_returnsWordWithSameId() {
  Word testWord = new Word("Home");
  assertEquals(Word.find(testWord.getId()), testWord);
}

@Test
public void addWord_addsWordToList() {
  Word testWord = new Word("Bob's Used Words");
  Word testWord = new Word("Mow the lawn");
  testWord.addWord(testWord);
  assertTrue(testWord.getWords().contains(testWord));
}
