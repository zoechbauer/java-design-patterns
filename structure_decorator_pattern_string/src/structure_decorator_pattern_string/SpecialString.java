package structure_decorator_pattern_string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class SpecialString {
   String string;

   public SpecialString(String string) {
      this.string = string;
   }

   // new method
   public int countCharA() {
      int counter = 0;
      for (int i = 0; i < string.length(); i++) {
         if (string.charAt(i) == 'a' || string.charAt(i) == 'A') {
            counter += 1;
         }
      }
      return counter;
   }

   // String methods generated with Eclypse Menu Source/Generate Delegate Methods
   public char charAt(int index) {
      return string.charAt(index);
   }

   public IntStream chars() {
      return string.chars();
   }

   public int codePointAt(int index) {
      return string.codePointAt(index);
   }

   public int codePointBefore(int index) {
      return string.codePointBefore(index);
   }

   public int codePointCount(int beginIndex, int endIndex) {
      return string.codePointCount(beginIndex, endIndex);
   }

   public IntStream codePoints() {
      return string.codePoints();
   }

   public int compareTo(String anotherString) {
      return string.compareTo(anotherString);
   }

   public int compareToIgnoreCase(String str) {
      return string.compareToIgnoreCase(str);
   }

   public String concat(String str) {
      return string.concat(str);
   }

   public boolean contains(CharSequence s) {
      return string.contains(s);
   }

   public boolean contentEquals(CharSequence cs) {
      return string.contentEquals(cs);
   }

   public boolean contentEquals(StringBuffer sb) {
      return string.contentEquals(sb);
   }

   public boolean endsWith(String suffix) {
      return string.endsWith(suffix);
   }

   public boolean equals(Object anObject) {
      return string.equals(anObject);
   }

   public boolean equalsIgnoreCase(String anotherString) {
      return string.equalsIgnoreCase(anotherString);
   }

   public byte[] getBytes() {
      return string.getBytes();
   }

   public byte[] getBytes(Charset charset) {
      return string.getBytes(charset);
   }

   public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
      string.getBytes(srcBegin, srcEnd, dst, dstBegin);
   }

   public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
      return string.getBytes(charsetName);
   }

   public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
      string.getChars(srcBegin, srcEnd, dst, dstBegin);
   }

   public int hashCode() {
      return string.hashCode();
   }

   public int indexOf(int ch, int fromIndex) {
      return string.indexOf(ch, fromIndex);
   }

   public int indexOf(int ch) {
      return string.indexOf(ch);
   }

   public int indexOf(String str, int fromIndex) {
      return string.indexOf(str, fromIndex);
   }

   public int indexOf(String str) {
      return string.indexOf(str);
   }

   public String intern() {
      return string.intern();
   }

   public boolean isEmpty() {
      return string.isEmpty();
   }

   public int lastIndexOf(int ch, int fromIndex) {
      return string.lastIndexOf(ch, fromIndex);
   }

   public int lastIndexOf(int ch) {
      return string.lastIndexOf(ch);
   }

   public int lastIndexOf(String str, int fromIndex) {
      return string.lastIndexOf(str, fromIndex);
   }

   public int lastIndexOf(String str) {
      return string.lastIndexOf(str);
   }

   public int length() {
      return string.length();
   }

   public boolean matches(String regex) {
      return string.matches(regex);
   }

   public int offsetByCodePoints(int index, int codePointOffset) {
      return string.offsetByCodePoints(index, codePointOffset);
   }

   public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
      return string.regionMatches(ignoreCase, toffset, other, ooffset, len);
   }

   public boolean regionMatches(int toffset, String other, int ooffset, int len) {
      return string.regionMatches(toffset, other, ooffset, len);
   }

   public String replace(char oldChar, char newChar) {
      return string.replace(oldChar, newChar);
   }

   public String replace(CharSequence target, CharSequence replacement) {
      return string.replace(target, replacement);
   }

   public String replaceAll(String regex, String replacement) {
      return string.replaceAll(regex, replacement);
   }

   public String replaceFirst(String regex, String replacement) {
      return string.replaceFirst(regex, replacement);
   }

   public String[] split(String regex, int limit) {
      return string.split(regex, limit);
   }

   public String[] split(String regex) {
      return string.split(regex);
   }

   public boolean startsWith(String prefix, int toffset) {
      return string.startsWith(prefix, toffset);
   }

   public boolean startsWith(String prefix) {
      return string.startsWith(prefix);
   }

   public CharSequence subSequence(int beginIndex, int endIndex) {
      return string.subSequence(beginIndex, endIndex);
   }

   public String substring(int beginIndex, int endIndex) {
      return string.substring(beginIndex, endIndex);
   }

   public String substring(int beginIndex) {
      return string.substring(beginIndex);
   }

   public char[] toCharArray() {
      return string.toCharArray();
   }

   public String toLowerCase() {
      return string.toLowerCase();
   }

   public String toLowerCase(Locale locale) {
      return string.toLowerCase(locale);
   }

   public String toString() {
      return string.toString();
   }

   public String toUpperCase() {
      return string.toUpperCase();
   }

   public String toUpperCase(Locale locale) {
      return string.toUpperCase(locale);
   }

   public String trim() {
      return string.trim();
   }

}
