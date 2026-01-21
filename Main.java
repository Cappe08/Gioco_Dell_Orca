public class Main {

    public static void main(String[] args) {
        System.out.println("=== GIOCO DELL'OCA ===");
        Domanda[] tutteDomande = new Domanda[90];

// --- GEOGRAFIA (0-14) ---
tutteDomande[0] = new Domanda(1, "Qual è la capitale della Francia?", 
    new String[]{"Parigi", "Londra", "Berlino", "Madrid"}, 0, 10, "Geografia");
tutteDomande[1] = new Domanda(2, "Qual è il fiume più lungo d'Italia?", 
    new String[]{"Tevere", "Arno", "Po", "Adige"}, 2, 10, "Geografia");
tutteDomande[2] = new Domanda(3, "In quale continente si trova l'Egitto?", 
    new String[]{"Asia", "Africa", "Europa", "America"}, 1, 10, "Geografia");
tutteDomande[3] = new Domanda(4, "Qual è l'oceano più grande del mondo?", 
    new String[]{"Atlantico", "Indiano", "Pacifico", "Artico"}, 2, 10, "Geografia");
tutteDomande[4] = new Domanda(5, "Qual è la capitale del Regno Unito?", 
    new String[]{"Dublino", "Londra", "Edimburgo", "Cardiff"}, 1, 10, "Geografia");
tutteDomande[5] = new Domanda(6, "Dove si trova il Colosseo?", 
    new String[]{"Milano", "Napoli", "Roma", "Venezia"}, 2, 10, "Geografia");
tutteDomande[6] = new Domanda(7, "Quale nazione ha la forma di uno stivale?", 
    new String[]{"Spagna", "Grecia", "Italia", "Portogallo"}, 2, 10, "Geografia");
tutteDomande[7] = new Domanda(8, "Qual è la montagna più alta del mondo?", 
    new String[]{"K2", "Monte Bianco", "Everest", "Kilimangiaro"}, 2, 10, "Geografia");
tutteDomande[8] = new Domanda(9, "Di che nazione è la bandiera del 'Sol Levante'?", 
    new String[]{"Cina", "Giappone", "Corea del Sud", "Vietnam"}, 1, 10, "Geografia");
tutteDomande[9] = new Domanda(10, "Qual è la capitale della Spagna?", 
    new String[]{"Barcellona", "Madrid", "Siviglia", "Lisbona"}, 1, 10, "Geografia");
tutteDomande[10] = new Domanda(11, "Quale regione italiana ha come capoluogo Firenze?", 
    new String[]{"Umbria", "Lazio", "Toscana", "Marche"}, 2, 10, "Geografia");
tutteDomande[11] = new Domanda(12, "In che città si trova la Statua della Libertà?", 
    new String[]{"Washington", "Los Angeles", "New York", "Chicago"}, 2, 10, "Geografia");
tutteDomande[12] = new Domanda(13, "Qual è il lago più grande d'Italia?", 
    new String[]{"Lago Maggiore", "Lago di Como", "Lago di Garda", "Lago Trasimeno"}, 2, 10, "Geografia");
tutteDomande[13] = new Domanda(14, "Quale canale separa il Regno Unito dalla Francia?", 
    new String[]{"Canale di Suez", "Canale di Panama", "La Manica", "Stretto di Gibilterra"}, 2, 10, "Geografia");
tutteDomande[14] = new Domanda(15, "Qual è la capitale della Germania?", 
    new String[]{"Monaco", "Amburgo", "Francoforte", "Berlino"}, 3, 10, "Geografia");

// --- STORIA (15-29) ---
tutteDomande[15] = new Domanda(16, "In che anno è stata scoperta l'America?", 
    new String[]{"1492", "1500", "1348", "1776"}, 0, 10, "Storia");
tutteDomande[16] = new Domanda(17, "Chi fu il primo imperatore romano?", 
    new String[]{"Giulio Cesare", "Nerone", "Augusto", "Traiano"}, 2, 10, "Storia");
tutteDomande[17] = new Domanda(18, "Quale civiltà costruì le piramidi?", 
    new String[]{"Romani", "Greci", "Egizi", "Maya"}, 2, 10, "Storia");
tutteDomande[18] = new Domanda(19, "Chi ha dipinto la Gioconda?", 
    new String[]{"Michelangelo", "Raffaello", "Leonardo da Vinci", "Donatello"}, 2, 10, "Storia");
tutteDomande[19] = new Domanda(20, "Come si chiamava il dittatore tedesco della II Guerra Mondiale?", 
    new String[]{"Mussolini", "Stalin", "Hitler", "Franco"}, 2, 10, "Storia");
tutteDomande[20] = new Domanda(21, "In che anno è caduto il Muro di Berlino?", 
    new String[]{"1945", "1960", "1989", "2001"}, 2, 10, "Storia");
tutteDomande[21] = new Domanda(22, "Chi fu il primo uomo ad andare sulla Luna?", 
    new String[]{"Yuri Gagarin", "Buzz Aldrin", "Neil Armstrong", "Michael Collins"}, 2, 10, "Storia");
tutteDomande[22] = new Domanda(23, "Qual era una moneta dell'Antica Roma?", 
    new String[]{"Euro", "Fiorino", "Sesterzio", "Lira"}, 2, 10, "Storia");
tutteDomande[23] = new Domanda(24, "Chi ha 'sciacquato i panni in Arno'?", 
    new String[]{"Dante", "Manzoni", "Petrarca", "Boccaccio"}, 1, 10, "Storia");
tutteDomande[24] = new Domanda(25, "Quale vulcano distrusse Pompei?", 
    new String[]{"Etna", "Stromboli", "Vesuvio", "Vulcano"}, 2, 10, "Storia");
tutteDomande[25] = new Domanda(26, "Chi è il patrono d'Italia?", 
    new String[]{"San Pietro", "San Francesco", "San Gennaro", "San Marco"}, 1, 10, "Storia");
tutteDomande[26] = new Domanda(27, "Come si chiamava una delle caravelle di Colombo?", 
    new String[]{"Santa Lucia", "Santa Maria", "San Giorgio", "Santa Rita"}, 1, 10, "Storia");
tutteDomande[27] = new Domanda(28, "Chi ha inventato la lampadina?", 
    new String[]{"Tesla", "Volta", "Edison", "Marconi"}, 2, 10, "Storia");
tutteDomande[28] = new Domanda(29, "Quale guerra si combatté tra il 1914 e il 1918?", 
    new String[]{"II Guerra Mondiale", "Guerra del Vietnam", "I Guerra Mondiale", "Guerra Fredda"}, 2, 10, "Storia");
tutteDomande[29] = new Domanda(30, "Chi fu incoronato imperatore nella notte di Natale dell'800?", 
    new String[]{"Napoleone", "Carlo Magno", "Giulio Cesare", "Barbarossa"}, 1, 10, "Storia");

// --- SCIENZE (30-44) ---
tutteDomande[30] = new Domanda(31, "Qual è il pianeta più vicino al Sole?", 
    new String[]{"Venere", "Mercurio", "Marte", "Terra"}, 1, 10, "Scienze");
tutteDomande[31] = new Domanda(32, "Qual è la formula chimica dell'acqua?", 
    new String[]{"CO2", "H2O", "O2", "NaCl"}, 1, 10, "Scienze");
tutteDomande[32] = new Domanda(33, "Quante zampe ha un ragno?", 
    new String[]{"6", "8", "10", "12"}, 1, 10, "Scienze");
tutteDomande[33] = new Domanda(34, "Qual è l'animale più veloce della terraferma?", 
    new String[]{"Leone", "Cavallo", "Ghepardo", "Gazzella"}, 2, 10, "Scienze");
tutteDomande[34] = new Domanda(35, "Cosa usano i pesci per respirare?", 
    new String[]{"Polmoni", "Branchie", "Pelle", "Naso"}, 1, 10, "Scienze");
tutteDomande[35] = new Domanda(36, "Qual è il 'Pianeta Rosso'?", 
    new String[]{"Giove", "Saturno", "Marte", "Mercurio"}, 2, 10, "Scienze");
tutteDomande[36] = new Domanda(37, "Quanti denti ha un adulto completo?", 
    new String[]{"28", "30", "32", "34"}, 2, 10, "Scienze");
tutteDomande[37] = new Domanda(38, "Qual è il mammifero più grande del mondo?", 
    new String[]{"Elefante", "Balenottera azzurra", "Orinoco", "Ippopotamo"}, 1, 10, "Scienze");
tutteDomande[38] = new Domanda(39, "A quanti gradi bolle l'acqua?", 
    new String[]{"50°C", "90°C", "100°C", "120°C"}, 2, 10, "Scienze");
tutteDomande[39] = new Domanda(40, "Qual è l'osso più lungo del corpo umano?", 
    new String[]{"Omero", "Femore", "Tibia", "Perone"}, 1, 10, "Scienze");
tutteDomande[40] = new Domanda(41, "Come si chiama il processo con cui le piante creano energia?", 
    new String[]{"Digestione", "Fotosintesi", "Osmosi", "Respirazione"}, 1, 10, "Scienze");
tutteDomande[41] = new Domanda(42, "Quanti cuori ha un polpo?", 
    new String[]{"1", "2", "3", "4"}, 2, 10, "Scienze");
tutteDomande[42] = new Domanda(43, "Quale gas respiriamo per vivere?", 
    new String[]{"Elio", "Azoto", "Ossigeno", "Idrogeno"}, 2, 10, "Scienze");
tutteDomande[43] = new Domanda(44, "Cosa studia l'astronomia?", 
    new String[]{"Gli astri", "Le piante", "Gli atomi", "Il futuro"}, 0, 10, "Scienze");
tutteDomande[44] = new Domanda(45, "Il pomodoro è tecnicamente...", 
    new String[]{"Una verdura", "Un frutto", "Una radice", "Un tubero"}, 1, 10, "Scienze");

// --- ARTE E LETTERATURA (45-59) ---
tutteDomande[45] = new Domanda(46, "Chi ha scritto la Divina Commedia?", 
    new String[]{"Petrarca", "Boccaccio", "Dante", "Leopardi"}, 2, 10, "Arte");
tutteDomande[46] = new Domanda(47, "Chi ha scolpito il David?", 
    new String[]{"Donatello", "Michelangelo", "Bernini", "Canova"}, 1, 10, "Arte");
tutteDomande[47] = new Domanda(48, "Quale burattino voleva diventare un bambino vero?", 
    new String[]{"Geppetto", "Lucignolo", "Pinocchio", "Mangiafuoco"}, 2, 10, "Arte");
tutteDomande[48] = new Domanda(49, "Chi ha scritto 'I Promessi Sposi'?", 
    new String[]{"Verga", "Pascoli", "Manzoni", "Pirandello"}, 2, 10, "Arte");
tutteDomande[49] = new Domanda(50, "Chi è il dio del tuono norreno?", 
    new String[]{"Odino", "Loki", "Thor", "Freya"}, 2, 10, "Arte");
tutteDomande[50] = new Domanda(51, "Chi ha scritto 'Romeo e Giulietta'?", 
    new String[]{"Dante", "Shakespeare", "Molière", "Goethe"}, 1, 10, "Arte");
tutteDomande[51] = new Domanda(52, "Quanti canti ha la Divina Commedia?", 
    new String[]{"33", "99", "100", "101"}, 2, 10, "Arte");
tutteDomande[52] = new Domanda(53, "Chi è il re degli dei greci?", 
    new String[]{"Poseidone", "Ade", "Zeus", "Apollo"}, 2, 10, "Arte");
tutteDomande[53] = new Domanda(54, "Quale pittore si tagliò un orecchio?", 
    new String[]{"Picasso", "Van Gogh", "Monet", "Dalì"}, 1, 10, "Arte");
tutteDomande[54] = new Domanda(55, "Chi ha scritto 'Il Piccolo Principe'?", 
    new String[]{"Saint-Exupéry", "Rodari", "Collodi", "Dahl"}, 0, 10, "Arte");
tutteDomande[55] = new Domanda(56, "Come si chiama il cavallo di Don Chisciotte?", 
    new String[]{"Furia", "Ronzinante", "Bucefalo", "Tornado"}, 1, 10, "Arte");
tutteDomande[56] = new Domanda(57, "L'Eneide racconta la fondazione di quale città?", 
    new String[]{"Atene", "Sparta", "Roma", "Cartagine"}, 2, 10, "Arte");
tutteDomande[57] = new Domanda(58, "Chi ha scritto la saga di Harry Potter?", 
    new String[]{"Tolkien", "King", "Rowling", "Lewis"}, 2, 10, "Arte");
tutteDomande[58] = new Domanda(59, "Cosa proteggono le Muse nella mitologia?", 
    new String[]{"La guerra", "Le arti", "Il mare", "L'agricoltura"}, 1, 10, "Arte");
tutteDomande[59] = new Domanda(60, "Chi ha dipinto 'La Nascita di Venere'?", 
    new String[]{"Raffaello", "Botticelli", "Tiziano", "Caravaggio"}, 1, 10, "Arte");

// --- INTRATTENIMENTO (60-74) ---
tutteDomande[60] = new Domanda(61, "Come si chiama il topo più famoso della Disney?", 
    new String[]{"Jerry", "Topolino", "Stuart Little", "Speedy Gonzales"}, 1, 10, "Svago");
tutteDomande[61] = new Domanda(62, "Qual è il codice dell'agente James Bond?", 
    new String[]{"001", "007", "777", "911"}, 1, 10, "Svago");
tutteDomande[62] = new Domanda(63, "Quale gruppo canta 'Mamma Mia'?", 
    new String[]{"Beatles", "Queen", "ABBA", "Rolling Stones"}, 2, 10, "Svago");
tutteDomande[63] = new Domanda(64, "Chi è il protagonista di 'Pirati dei Caraibi'?", 
    new String[]{"Jack Sparrow", "Uncino", "Barbanera", "Will Turner"}, 0, 10, "Svago");
tutteDomande[64] = new Domanda(65, "Come si chiama la città di Batman?", 
    new String[]{"Metropolis", "New York", "Gotham City", "Star City"}, 2, 10, "Svago");
tutteDomande[65] = new Domanda(66, "Di che colore è la pantera dei cartoni?", 
    new String[]{"Nera", "Rosa", "Blu", "Viola"}, 1, 10, "Svago");
tutteDomande[66] = new Domanda(67, "Chi è la compagna di Tarzan?", 
    new String[]{"Mary", "Lois", "Jane", "Alice"}, 2, 10, "Svago");
tutteDomande[67] = new Domanda(68, "Quale band inglese cantava 'Yesterday'?", 
    new String[]{"Pink Floyd", "The Beatles", "The Who", "Led Zeppelin"}, 1, 10, "Svago");
tutteDomande[68] = new Domanda(69, "Come si chiama l'orco verde dei film d'animazione?", 
    new String[]{"Hulk", "Shrek", "Fiona", "Grinch"}, 1, 10, "Svago");
tutteDomande[69] = new Domanda(70, "Qual è il vero nome di Superman?", 
    new String[]{"Peter Parker", "Bruce Wayne", "Clark Kent", "Tony Stark"}, 2, 10, "Svago");
tutteDomande[70] = new Domanda(71, "Chi è considerato il Re del Pop?", 
    new String[]{"Elvis Presley", "Prince", "Michael Jackson", "Madonna"}, 2, 10, "Svago");
tutteDomande[71] = new Domanda(72, "In quale film un bambino perde l'aereo?", 
    new String[]{"Mamma ho perso l'aereo", "Ritorno al futuro", "E.T.", "Goonies"}, 0, 10, "Svago");
tutteDomande[72] = new Domanda(73, "Quale frutto avvelenato mangia Biancaneve?", 
    new String[]{"Pera", "Mela", "Banana", "Fragola"}, 1, 10, "Svago");
tutteDomande[73] = new Domanda(74, "Chi è il protagonista di Dragon Ball?", 
    new String[]{"Vegeta", "Goku", "Gohan", "Piccolo"}, 1, 10, "Svago");
tutteDomande[74] = new Domanda(75, "Quale talent show cerca la voce migliore?", 
    new String[]{"X Factor", "Amici", "The Voice", "Got Talent"}, 2, 10, "Svago");

// --- SPORT E MISTO (75-89) ---
tutteDomande[75] = new Domanda(76, "Quanti giocatori di calcio scendono in campo per squadra?", 
    new String[]{"7", "11", "15", "9"}, 1, 10, "Misto");
tutteDomande[76] = new Domanda(77, "Di che colore è la maglia della Nazionale Italiana?", 
    new String[]{"Rossa", "Verde", "Bianca", "Azzurra"}, 3, 10, "Misto");
tutteDomande[77] = new Domanda(78, "Quanti cerchi ci sono nella bandiera olimpica?", 
    new String[]{"3", "4", "5", "6"}, 2, 10, "Misto");
tutteDomande[78] = new Domanda(79, "In quale sport si usa il volano?", 
    new String[]{"Tennis", "Badminton", "Ping Pong", "Squash"}, 1, 10, "Misto");
tutteDomande[79] = new Domanda(80, "Quante caselle ha una scacchiera?", 
    new String[]{"32", "64", "100", "50"}, 1, 10, "Misto");
tutteDomande[80] = new Domanda(81, "Qual è la lotta nazionale del Giappone?", 
    new String[]{"Judo", "Karate", "Sumo", "Aikido"}, 2, 10, "Misto");
tutteDomande[81] = new Domanda(82, "Quanti secondi ci sono in un minuto?", 
    new String[]{"100", "60", "50", "30"}, 1, 10, "Misto");
tutteDomande[82] = new Domanda(83, "Quali sono i colori della bandiera italiana?", 
    new String[]{"Verde Bianco Rosso", "Blu Bianco Rosso", "Giallo Rosso", "Verde Giallo Blu"}, 0, 10, "Misto");
tutteDomande[83] = new Domanda(84, "Quanti giorni ha un anno bisestile?", 
    new String[]{"364", "365", "366", "360"}, 2, 10, "Misto");
tutteDomande[84] = new Domanda(85, "In che mese si festeggia Natale?", 
    new String[]{"Novembre", "Dicembre", "Gennaio", "Ottobre"}, 1, 10, "Misto");
tutteDomande[85] = new Domanda(86, "Cosa si festeggia il 25 Aprile in Italia?", 
    new String[]{"Repubblica", "Lavoro", "Liberazione", "Natale"}, 2, 10, "Misto");
tutteDomande[86] = new Domanda(87, "Quanti sono i segni zodiacali?", 
    new String[]{"10", "12", "13", "14"}, 1, 10, "Misto");
tutteDomande[87] = new Domanda(88, "Quale uccello simboleggia la pace?", 
    new String[]{"Aquila", "Colomba", "Corvo", "Gabbiano"}, 1, 10, "Misto");
tutteDomande[88] = new Domanda(89, "Quale strumento ha 88 tasti?", 
    new String[]{"Chitarra", "Pianoforte", "Violino", "Flauto"}, 1, 10, "Misto");
tutteDomande[89] = new Domanda(90, "Quanto fa 7 per 8?", 
    new String[]{"48", "54", "56", "64"}, 2, 10, "Misto");

        // ===========================
        // CREAZIONE TABELLONE 30 CASELLE
        // ===========================
        int numCaselle = 30;
        Casella[] caselle = new Casella[numCaselle];
        for (int i = 0; i < numCaselle; i++) {
            caselle[i] = new Casella(i, "Casella " + (i + 1), tutteDomande[i % 30], 5);
            if (i > 0) caselle[i].setPrecedente(caselle[i - 1]);
            if (i < numCaselle - 1) caselle[i].setSuccessiva(caselle[i + 1]);
        }

        // ===========================
        // CREAZIONE GIOCATORI (max 5)
        // ===========================
        int numGiocatori;
        do {
            System.out.print("Inserisci il numero di giocatori (max 5): ");
            numGiocatori = Leggi.unInt();
        } while (numGiocatori < 1 || numGiocatori > 5);

        Giocatore[] giocatori = new Giocatore[numGiocatori];

        for (int i = 0; i < numGiocatori; i++) {
            System.out.print("Nome giocatore " + (i + 1) + ": ");
            String nome = Leggi.unoString();
            System.out.print("Pedina (un carattere): ");
            char pedina = Leggi.unChar();
            giocatori[i] = new Giocatore(nome, pedina);
            giocatori[i].riceviPunti(10); // punteggio iniziale
            caselle[0].aggiungiGiocatore(giocatori[i]);
        }

        // ===========================
        // CREAZIONE DADO
        // ===========================
        Dado dado = new Dado(6);

        // ===========================
        // FLUSSO PRINCIPALE DI GIOCO
        // ===========================
        boolean giocoFinito = false;

        while (!giocoFinito) {
            for (int i = 0; i < numGiocatori && !giocoFinito; i++) {
                Giocatore g = giocatori[i];

                if (g.getPunteggio() <= 0) {
                    System.out.println(g.getNome() + " ha punteggio 0 o negativo e salta il turno.");
                    continue;
                }

                System.out.println("\nTurno di " + g.getNome() + " (Punti: " + g.getPunteggio() + ")");
                System.out.print("Premi invio per lanciare il dado...");
                Leggi.unoString();

                int lancio = dado.lancia(dado.getNumeroFacce());
                System.out.println("Hai tirato: " + lancio);

                // calcolo nuova casella
                Casella attuale = g.getCasellaCorrente();
                int indiceNuovo = attuale.getId() + lancio;
                if (indiceNuovo >= numCaselle) {
                    indiceNuovo = numCaselle - 1 - (indiceNuovo - (numCaselle - 1));
                    System.out.println("Hai superato la casella finale! Torni indietro a " + (indiceNuovo + 1));
                }
                Casella destinazione = caselle[indiceNuovo];

                attuale.rimuoviGiocatore(g);
                destinazione.aggiungiGiocatore(g);

                // risposta alla domanda
                destinazione.attivaDomanda(g);

                if (g.getPunteggio() <= 0) {
                    System.out.println(g.getNome() + " ha perso tutti i punti e viene eliminato!");
                    destinazione.rimuoviGiocatore(g);
                    continue;
                }

                // lotta se più giocatori
                if (destinazione.getNumGiocatori() > 1) {
                    System.out.println("Inizio lotta sulla casella!");
                    Giocatore avversario = destinazione.getAltroGiocatore(g);
                    int puntiVinti = lottaDadi(g, avversario, dado);
                    g.riceviPunti(puntiVinti);
                    avversario.dimezzaPunteggio();
                    System.out.println(g.getNome() + " vince la lotta e prende punti dall'avversario!");
                }

                // verifica vincitore finale
                if (destinazione.getId() == numCaselle - 1 && g.getPunteggio() > 0) {
                    System.out.println("\n🎉 " + g.getNome() + " HA VINTO! 🎉");
                    giocoFinito = true;
                    break;
                }
            }
        }

        // ===========================
        // RISULTATI FINALI
        // ===========================
        System.out.println("\n=== PUNTEGGI FINALI ===");
        for (Giocatore g : giocatori) {
            System.out.println(g.getNome() + ": " + g.getPunteggio());
        }
    }

    // ===========================
    // LOTTA TRA DUE GIOCATORI
    // ===========================
    public static int lottaDadi(Giocatore g1, Giocatore g2, Dado dado) {
        int puntiVinti = 0;
        for (int i = 0; i < 3; i++) {
            int l1 = dado.lancia(dado.getNumeroFacce());
            int l2 = dado.lancia(dado.getNumeroFacce());
            if (l1 > l2) puntiVinti += 1;
            else if (l2 > l1) puntiVinti -= 1;
        }
        return puntiVinti > 0 ? g2.getPunteggio() / 2 : 0;
    }
}
