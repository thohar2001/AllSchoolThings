Denna hemsida, index.html, är stilsatt med hjälp av en CSS-fil samt dess funktionalitet av en JavaScript fil.

CSS-filen (style.css) ligger i en undermapp som heter css och JavaScript-filen (events.js) ligger i js. 

Hemsidan har en liten ikon som heter favicon.ico.

Hemsidan består av fyra knappar längst upp på sidan:
"Random", "Short", "Shower" och "Traditional". beroende på vilken man trycker på dyker det upp ett skämt av den kategorin med hjälp av en fortune-server. 
När man öppnar hemsidan så dyker det automatiskt upp ett skämt (fortune) av kategorin "Random". Vilket skämt som tillhör vilken kategori framgår tydligt av en rubrik.

Max 10 skämt visas samtidigt på sidan. Skulle gränsen överskridas läggs ett nytt skämt till längst upp och det längst ner försvinner. 

Hemsidan har även ett sökfält och en knapp för att söka på skämt. Då visas det max 30st skämt från ditt sökresultat,
men visar även hur många matchningar du egentligen fick. Denna sökfunktion är case-sensitive. 

Trycker man på någon av de fyra knapparna av valfri kategori rensas ditt sökresultat och det dyker upp ett nytt skämt av den kategorin.

Om fortune-servern ligger nere så får man reda på det på hemsidan genom ett meddelande där det står att man får försöka igen senare om man försöker
hämta eller söka på skämt. 

Hemsidan är mobilanpassad med hjälp av media queries och rekommendationen är att man inte använder en enhet med mindre skärm än iPhone 5 för att behålla en snygg layout. 