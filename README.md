# test-driven-dev-ser515
Following test driven development for counting urinals

*Problem Statement :* 
How many urinals are free? 
In men's public toilets with urinals, there is this unwritten rule that you leave at least one urinal free between you and 
the next person peeing. For example, if there are 3 urinals and one person is already peeing in the left one, you will 
choose the urinal on the right and not the one in the middle. That means that a maximum of 3 people can pee at the 
same time on public toilets with 5 urinals when following this rule (Only 2 if the first-person pees into urinal 2 or 4). 

*Implementation :*
1. The code is present in `src/src/application/urinals.java`
2. The tests are present in `src/src/application/urinalsTest.java`
3. The datafile is present in `src/src/urinal.dat`
4. There is an option to either enter data using keyboard or use the inputs in urinal.dat. Once either of these is executed, "Done" is displayed.
5. For the keyboard option, you can continuously enter inputs. If you want to stop, enter -1.
6. FOr datafile option, The output files will be created in `src/rulesX.txt`. I have observed that the files are not seen in eclipse immediately, but if you go to that location in the file explorer, that output files are created correctly.
