public class PercorsoFile {

	public static Domandiere creaQuiz() {

		Domanda[] tutte = new Domanda[100];
		int idx = 0;
		// GEOGRAFIA – FACILE
        tutte[idx++] = new Domanda(1, "Capitale dell'Italia?", new String[]{"Roma","Milano","Napoli"},1,1,"facile");
        tutte[idx++] = new Domanda(2, "Capitale della Francia?", new String[]{"Lione","Parigi","Marsiglia"},2,1,"facile");
        tutte[idx++] = new Domanda(3, "Capitale della Germania?", new String[]{"Berlino","Monaco","Amburgo"},1,1,"facile");
        tutte[idx++] = new Domanda(4, "Capitale della Spagna?", new String[]{"Madrid","Barcellona","Valencia"},1,1,"facile");
        tutte[idx++] = new Domanda(5, "Capitale del Portogallo?", new String[]{"Porto","Lisbona","Braga"},2,1,"facile");
        tutte[idx++] = new Domanda(6, "Oceano più grande?", new String[]{"Pacifico","Atlantico","Indiano"},1,1,"facile");
        tutte[idx++] = new Domanda(7, "Fiume più lungo del mondo?", new String[]{"Nilo","Amazzoni","Yangtze"},2,2,"media");
        tutte[idx++] = new Domanda(8, "Montagna più alta del mondo?", new String[]{"Everest","K2","Kangchenjunga"},1,1,"facile");
        tutte[idx++] = new Domanda(9, "Deserto più grande?", new String[]{"Sahara","Gobi","Arabia"},1,1,"facile");
        tutte[idx++] = new Domanda(10, "Paese più popoloso?", new String[]{"India","Cina","USA"},1,2,"media");
        tutte[idx++] = new Domanda(11, "Paese più grande?", new String[]{"Russia","Canada","Cina"},1,1,"facile");
        tutte[idx++] = new Domanda(12, "Isola più grande?", new String[]{"Groenlandia","Madagascar","Borneo"},1,2,"media");
        tutte[idx++] = new Domanda(13, "Continente più grande?", new String[]{"Asia","Africa","America"},1,1,"facile");
        tutte[idx++] = new Domanda(14, "Continente più piccolo?", new String[]{"Australia","Europa","Antartide"},1,1,"facile");
        tutte[idx++] = new Domanda(15, "Capitale del Giappone?", new String[]{"Tokyo","Osaka","Kyoto"},1,1,"facile");
        tutte[idx++] = new Domanda(16, "Capitale della Cina?", new String[]{"Shanghai","Pechino","Hong Kong"},2,1,"facile");
        tutte[idx++] = new Domanda(17, "Capitale dell'Egitto?", new String[]{"Il Cairo","Giza","Luxor"},1,1,"facile");
        tutte[idx++] = new Domanda(18, "Capitale del Brasile?", new String[]{"Brasilia","Rio","San Paolo"},1,1,"facile");
        tutte[idx++] = new Domanda(19, "Capitale del Canada?", new String[]{"Toronto","Ottawa","Vancouver"},2,1,"facile");
        tutte[idx++] = new Domanda(20, "Capitale dell'Australia?", new String[]{"Sydney","Melbourne","Canberra"},3,2,"media");

        // STORIA – MEDIA
        tutte[idx++] = new Domanda(21, "Chi ha scoperto l'America?", new String[]{"Colombo","Vespucci","Magellano"},1,2,"media");
        tutte[idx++] = new Domanda(22, "Anno di scoperta dell'America?", new String[]{"1492","1500","1400"},1,2,"media");
        tutte[idx++] = new Domanda(23, "Chi ha scritto la Divina Commedia?", new String[]{"Dante","Manzoni","Boccaccio"},1,2,"media");
        tutte[idx++] = new Domanda(24, "Chi era il primo imperatore romano?", new String[]{"Augusto","Nerone","Cesare"},1,2,"media");
        tutte[idx++] = new Domanda(25, "Chi ha costruito le piramidi?", new String[]{"Egizi","Maya","Romani"},1,1,"facile");
        tutte[idx++] = new Domanda(26, "Chi era Napoleone?", new String[]{"Imperatore","Re","Generale greco"},1,2,"media");
        tutte[idx++] = new Domanda(27, "Chi ha dipinto la Gioconda?", new String[]{"Leonardo","Michelangelo","Raffaello"},1,2,"media");
        tutte[idx++] = new Domanda(28, "Chi ha scritto I Promessi Sposi?", new String[]{"Manzoni","Dante","Leopardi"},1,2,"media");
        tutte[idx++] = new Domanda(29, "Chi era Cleopatra?", new String[]{"Regina d'Egitto","Imperatrice romana","Regina greca"},1,2,"media");
        tutte[idx++] = new Domanda(30, "Chi era Giulio Cesare?", new String[]{"Generale romano","Re","Filosofo"},1,2,"media");
        // STORIA / PERSONAGGI – MEDIA / FACILE
        tutte[idx++] = new Domanda(31, "Chi ha inventato il telefono?", new String[]{"Bell","Edison","Tesla"},1,2,"media");
        tutte[idx++] = new Domanda(32, "Chi ha inventato la lampadina?", new String[]{"Edison","Tesla","Bell"},1,2,"media");
        tutte[idx++] = new Domanda(33, "Chi ha scritto Il Piccolo Principe?", new String[]{"Saint-Exupéry","Verne","Hugo"},1,2,"media");
        tutte[idx++] = new Domanda(34, "Chi era Mozart?", new String[]{"Compositore","Pittore","Re"},1,1,"facile");
        tutte[idx++] = new Domanda(35, "Chi era Beethoven?", new String[]{"Compositore","Scienziato","Re"},1,1,"facile");
        tutte[idx++] = new Domanda(36, "Chi era Galileo?", new String[]{"Scienziato","Pittore","Re"},1,1,"facile");
        tutte[idx++] = new Domanda(37, "Chi era Marco Polo?", new String[]{"Esploratore","Re","Filosofo"},1,1,"facile");
        tutte[idx++] = new Domanda(38, "Chi era Alessandro Magno?", new String[]{"Conquistatore","Filosofo","Re d'Italia"},1,2,"media");
        tutte[idx++] = new Domanda(39, "Chi era Nerone?", new String[]{"Imperatore romano","Filosofo","Generale"},1,2,"media");
        tutte[idx++] = new Domanda(40, "Chi era Tutankhamon?", new String[]{"Faraone","Re greco","Imperatore"},1,2,"media");

        // SCIENZE – FACILE / MEDIA
        tutte[idx++] = new Domanda(41, "Molecola dell'acqua?", new String[]{"H2O","CO2","O2"},1,1,"facile");
        tutte[idx++] = new Domanda(42, "Simbolo del ferro?", new String[]{"Fe","Ir","Fr"},1,1,"facile");
        tutte[idx++] = new Domanda(43, "Simbolo dell'oro?", new String[]{"Au","Ag","Pt"},1,1,"facile");
        tutte[idx++] = new Domanda(44, "Simbolo dell'ossigeno?", new String[]{"O","Ox","Og"},1,1,"facile");
        tutte[idx++] = new Domanda(45, "Simbolo dell'idrogeno?", new String[]{"H","Hy","Hg"},1,1,"facile");
        tutte[idx++] = new Domanda(46, "Gas più abbondante nell'atmosfera?", new String[]{"Azoto","Ossigeno","Argon"},1,1,"facile");
        tutte[idx++] = new Domanda(47, "Pianeta rosso?", new String[]{"Marte","Venere","Mercurio"},1,1,"facile");
        tutte[idx++] = new Domanda(48, "Pianeta più grande?", new String[]{"Giove","Saturno","Urano"},1,1,"facile");
        tutte[idx++] = new Domanda(49, "Pianeta più caldo?", new String[]{"Venere","Mercurio","Marte"},1,2,"media");
        tutte[idx++] = new Domanda(50, "Stella al centro del Sistema Solare?", new String[]{"Sole","Sirio","Polare"},1,1,"facile");

        // BIOLOGIA – FACILE / MEDIA
        tutte[idx++] = new Domanda(51, "Organo che pompa il sangue?", new String[]{"Cuore","Fegato","Rene"},1,1,"facile");
        tutte[idx++] = new Domanda(52, "Organo della respirazione?", new String[]{"Polmoni","Stomaco","Fegato"},1,1,"facile");
        tutte[idx++] = new Domanda(53, "Quante ossa ha il corpo umano?", new String[]{"206","210","190"},1,2,"media");

        // ANIMALI – FACILE / MEDIA
        tutte[idx++] = new Domanda(54, "Mammifero più grande?", new String[]{"Balena blu","Elefante","Orso"},1,1,"facile");
        tutte[idx++] = new Domanda(55, "Animale più veloce?", new String[]{"Falco pellegrino","Ghepardo","Leopardo"},1,2,"media");
        tutte[idx++] = new Domanda(56, "Uccello più grande?", new String[]{"Struzzo","Aquila","Condor"},1,1,"facile");
        tutte[idx++] = new Domanda(57, "Pesce più grande?", new String[]{"Squalo balena","Tonno","Orca"},1,1,"facile");
        tutte[idx++] = new Domanda(58, "Rettili più grande?", new String[]{"Coccodrillo","Anaconda","Varano"},1,1,"facile");
        tutte[idx++] = new Domanda(59, "Felino più grande?", new String[]{"Tigre","Leone","Giaguaro"},1,1,"facile");
        tutte[idx++] = new Domanda(60, "Animale più longevo?", new String[]{"Tartaruga","Elefante","Balena"},1,1,"facile");

        // MATEMATICA – FACILE
        tutte[idx++] = new Domanda(61, "Quanto fa 7 + 8?", new String[]{"14","15","16"},2,1,"facile");
        tutte[idx++] = new Domanda(62, "Quanto fa 12 x 12?", new String[]{"144","124","132"},1,1,"facile");
        tutte[idx++] = new Domanda(63, "Quanto fa 100 / 4?", new String[]{"20","25","30"},2,1,"facile");
        tutte[idx++] = new Domanda(64, "Quanto fa 9 x 9?", new String[]{"81","72","99"},1,1,"facile");
        tutte[idx++] = new Domanda(65, "Quanto fa 50 + 25?", new String[]{"65","70","75"},3,1,"facile");
        tutte[idx++] = new Domanda(66, "Quanto fa 30 - 12?", new String[]{"18","20","22"},1,1,"facile");
        tutte[idx++] = new Domanda(67, "Quanto fa 6 x 7?", new String[]{"42","36","48"},1,1,"facile");
        tutte[idx++] = new Domanda(68, "Quanto fa 15 + 15?", new String[]{"25","30","35"},2,1,"facile");
        tutte[idx++] = new Domanda(69, "Quanto fa 90 / 10?", new String[]{"9","10","8"},1,1,"facile");
        tutte[idx++] = new Domanda(70, "Quanto fa 3 x 5?", new String[]{"15","10","12"},1,1,"facile");

        // MATEMATICA – FACILE (continua)
        tutte[idx++] = new Domanda(71, "Quanto fa 11 + 22?", new String[]{"33","32","34"},1,1,"facile");
        tutte[idx++] = new Domanda(72, "Quanto fa 8 x 8?", new String[]{"64","56","72"},1,1,"facile");
        tutte[idx++] = new Domanda(73, "Quanto fa 100 - 1?", new String[]{"99","98","97"},1,1,"facile");
        tutte[idx++] = new Domanda(74, "Quanto fa 14 + 6?", new String[]{"18","20","22"},2,1,"facile");
        tutte[idx++] = new Domanda(75, "Quanto fa 5 x 5?", new String[]{"25","20","30"},1,1,"facile");
        tutte[idx++] = new Domanda(76, "Quanto fa 81 / 9?", new String[]{"9","8","7"},1,1,"facile");
        tutte[idx++] = new Domanda(77, "Quanto fa 7 x 3?", new String[]{"21","24","18"},1,1,"facile");
        tutte[idx++] = new Domanda(78, "Quanto fa 10 + 90?", new String[]{"100","110","90"},1,1,"facile");
        tutte[idx++] = new Domanda(79, "Quanto fa 4 x 4?", new String[]{"16","12","20"},1,1,"facile");
        tutte[idx++] = new Domanda(80, "Quanto fa 6 + 6?", new String[]{"10","12","14"},2,1,"facile");

        // LINGUE / CULTURA – FACILE / MEDIA
        tutte[idx++] = new Domanda(81, "Lingua più parlata al mondo?", new String[]{"Cinese","Inglese","Spagnolo"},1,2,"media");
        tutte[idx++] = new Domanda(82, "Valuta del Giappone?", new String[]{"Yen","Won","Yuan"},1,1,"facile");
        tutte[idx++] = new Domanda(83, "Valuta degli USA?", new String[]{"Euro","Dollaro","Peso"},2,1,"facile");
        tutte[idx++] = new Domanda(84, "Valuta del Regno Unito?", new String[]{"Sterlina","Euro","Dollaro"},1,1,"facile");
        tutte[idx++] = new Domanda(85, "Lingua ufficiale del Brasile?", new String[]{"Portoghese","Spagnolo","Inglese"},1,1,"facile");
        tutte[idx++] = new Domanda(86, "Lingua ufficiale dell'Egitto?", new String[]{"Arabo","Turco","Persiano"},1,1,"facile");
        tutte[idx++] = new Domanda(87, "Lingua ufficiale dell'Australia?", new String[]{"Inglese","Francese","Tedesco"},1,1,"facile");
        tutte[idx++] = new Domanda(88, "Lingua ufficiale del Messico?", new String[]{"Spagnolo","Portoghese","Inglese"},1,1,"facile");
        tutte[idx++] = new Domanda(89, "Lingua ufficiale dell'India?", new String[]{"Hindi","Inglese","Tamil"},1,2,"media");

        // VARIE – FACILE
        tutte[idx++] = new Domanda(90, "Colore del sangue?", new String[]{"Rosso","Blu","Verde"},1,1,"facile");
        tutte[idx++] = new Domanda(91, "Strumento per misurare la temperatura?", new String[]{"Termometro","Barometro","Igrometro"},1,1,"facile");
        tutte[idx++] = new Domanda(92, "Strumento per misurare la pressione?", new String[]{"Barometro","Termometro","Igrometro"},1,1,"facile");
        tutte[idx++] = new Domanda(93, "Strumento per misurare l'umidità?", new String[]{"Igrometro","Barometro","Termometro"},1,1,"facile");
        tutte[idx++] = new Domanda(94, "Qual è il simbolo della pace?", new String[]{"Colomba","Aquila","Leone"},1,1,"facile");
        tutte[idx++] = new Domanda(95, "Qual è il colore della bandiera italiana?", new String[]{"Verde bianco rosso","Blu bianco rosso","Giallo rosso"},1,1,"facile");
        tutte[idx++] = new Domanda(96, "Qual è il mese più corto?", new String[]{"Febbraio","Marzo","Gennaio"},1,1,"facile");
        tutte[idx++] = new Domanda(97, "Quanti giorni ha un anno?", new String[]{"365","360","370"},1,1,"facile");
        tutte[idx++] = new Domanda(98, "Quanti giorni ha una settimana?", new String[]{"7","5","6"},1,1,"facile");
        tutte[idx++] = new Domanda(99, "Quanti secondi ci sono in un minuto?", new String[]{"60","100","30"},1,1,"facile");
        tutte[idx++] = new Domanda(100, "Quanti minuti ci sono in un'ora?", new String[]{"60","100","30"},1,1,"facile");

		for(int i = 0; i < tutte.length; i++){
			int r = (int)(Math.random() * tutte.length);
			Domanda temp = tutte[i];
			tutte[i] = tutte[r];
			tutte[r] = temp;
		}

		Domandiere lista = new Domandiere(100);

		for(int i = 0; i < tutte.length; i++){
			lista.aggiungiDomanda(tutte[i]);
		}
		return lista;
	}
}