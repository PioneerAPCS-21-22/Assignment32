# Assignment 32

The GC-content of a DNA string is given by the percentage of symbols in the string that are 'C' or 'G'. For example, the GC-content of "AGCTATAG" is 37.5%. Note that the reverse complement of any DNA string has the same GC-content.

DNA strings must be labeled when they are consolidated into a database. A commonly used method of string labeling is called FASTA format. In this format, the string is introduced by a line that begins with '>', followed by some labeling information. Subsequent lines contain the string itself; the first line to begin with '>' indicates the label of the next string.

In this implementation, a string in FASTA format will be labeled by the ID "OBI\_xxxx", where "xxxx" denotes a four-digit code between 0000 and 9999.

Given at most 10 DNA strings in FASTA format, return the ID of the string having the highest GC-content, followed by the GC-content of that string.

## Specifications

Only one class is needed, but please break up your code logically into methods.

In my implementation I allowed the user to input Strings for ids and put those in one array, then had them input strands that go into a separate array.

Print out the id with the largest GC content percentage and print the percentage.

You may use your GC-content code from first-semester's assignment.

### Sample Outputs

```
How many strands? 3
Id #1: OBI_6404
strand #1: CCTGCGGAAGATCGGCACTAGAATAGCCAGAACCGTTTCTCTGAGGCTTCCGGCCTTCCCTCCCACTAATAATTCTGAGG
Id #2: OBI_5959
strand #2: CCATCGGTAGCGCATCCTTAGTCCAATTAAGTCCCTATCCAGGCGCTCCGCCGAAGGTCTATATCCATTTGTCAGCAGACACGC
Id #3: OBI_0808
strand #3: CCACCCTCGTGGTATGGCTAGGCATTCAGGAACCGGAGAACGCTTCAGACCAGCCCGGACTGGGAACCTGCGGGCAGTAGGTGGAAT

Highest GC-content: OBI_0808 (60.91954022988506 %)
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

