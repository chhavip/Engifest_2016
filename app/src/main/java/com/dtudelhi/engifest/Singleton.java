package com.dtudelhi.engifest;

import com.dtudelhi.engifest.models.Events;
import com.dtudelhi.engifest.models.Sponsors;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chhavi on 29/1/16.
 */
public class Singleton {

    private static Singleton singleton =null;

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private Singleton(){
    }

    /* Static 'instance' method */
    public static Singleton getInstance( ) {
        if(singleton == null){
            return new Singleton();
        }
        return singleton;
    }
    public void initialiseDb(){
        List<Sponsors> caregories = new ArrayList<>();
        caregories.add(new Sponsors( "Dance", R.drawable.dance));
        caregories.add(new Sponsors("Music", R.drawable.music));
        caregories.add(new Sponsors ("Drama", R.drawable.drama));
        caregories.add(new Sponsors("Fashion", R.drawable.fashion));
        caregories.add(new Sponsors("Pro Nights", R.drawable.pro_nights));
        caregories.add(new Sponsors("Literary", R.drawable.music));
        caregories.add(new Sponsors("Miscellaneous", R.drawable.misc));
        caregories.add(new Sponsors("Informal Events", R.drawable.inf));

        SugarRecord.saveInTx(caregories);

        List<Events> danceEvents = new ArrayList<>();
        String rules;
        String contacts;
//        ArrayList<Contact> contacts = new ArrayList<Contact>();
        rules = "1. There will be two rounds The first one will be video shortlisting and the second will be the final performance on the campus premises.\n" +
                "2. Only college students are allowed.\n" +
                "3. Last date of online registration is 08/02/16. On the spot registrations will not be entertained.\n" +
                "4. Any props/costumes if to be used should be arranged by the participants. Use of fire or any other inflammable object is restricted.\n" +
                "5. Time limit is 2-4 minutes.\n" +
                "6. Qualified participants have to ensure that one copy of their edited song is with the event head and one copy they should carry with them. Song should be in .mp3 format. Also, it is the contestant's duty to be careful and aware of the order of performance and should be present 15 minutes before the allotted time.\n" +
                "7. All the participants are required to carry their identity cards to the campus on the day of the event.\n" +
                "8. The organizing committee reserves the right to change the venue, time and rules, if required.\n" +
                "9. The decision of the judges will be final and binding. ";
        contacts = "Surabhi Seth +91-9971819013 \n" +
                "Saurabh Suman +91-9582317061 \n" +
                "Achal Yadav +91-8376054139 \n" +
                "Pooja Gupta +91-7838724227";
        danceEvents.add(new Events("Dance", "Spandan (Solo)", "OAT", "Dance is the language of the soul and ENGIFEST'16 gives every soul a beautiful platform to express, a competitive environment for every dancer to showcase their talent.Calling out to all dance enthusiasts to dance their hearts out. Whatever your style be - jazz, hip hop, contemporary, classical or freestyle, SPANDAN gives you a chance to showcase your hidden talent and passion. ", "13th February"
                , "10 AM", "100/team", rules, contacts, "https://docs.google.com/forms/d/1toE-wWFwzpsZRdIHI_qy15BznyKX6Xb2JWWXqqU_La4/viewform?c=0&w=1&usp=send_form", false, "http://engifest.dtu.ac.in/events/spandan-solo/spandan%28solo%29.jpg"));

        rules = "1. There will be two rounds The first one will be video shortlisting and the second will be the final performance on the campus premises.\n" +
                "2. There is no restriction on the theme. It's an Open theme Group Dance Competition.\n" +
                "3. Maximum 1 team per college allowed.\n" +
                "4. Decision of the judges and the Organising Committee will be final and binding.\n" +
                "5. No responsibility will be held by DTU for any late or lost entries or any such events.\n" +
                "6. Team size should not be more than 20. However there must be at least 6 members on stage at any point during the performance.";

        contacts = "Surabhi Seth +91-9971819013 \n" +
                "Saurabh Suman +91-9582317061 \n" +
                "Achal Yadav +91-8376054139 \n" +
                "Pooja Gupta +91-7838724227";
        danceEvents.add(new Events("Dance", "Spandan (Group)", "BR Ambedkar Auditorium", "Dancing together is different feet moving to the same beats. So move your feet in synergy and leave a lasting impression on the audience. We invite you to a fleeting moment where you feel alive, to enchant the crowd with your vibrant rhythm and to claim the Spandan crown. ",
                "14th February", "12:00 pm", " 300 / team", rules, contacts, "https://docs.google.com/forms/d/1bn0BW9Z1LpaZpHkkFtc6SbeHUtkKoBIbLF35VmZy-go/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/spandan-group/spandan(group).jpg"));



        rules = "\n" +
                "Group\n" +
                "1. Teams have to perform one of the following dance forms:\n" +
                "Alkap, Bhangra, Bhavai, Bihu, Cheraw (bamboo dance) , Chhau, Dhap, Dumhal, Gambhira,Garba (dandiya), Gaur dance, Ghoomar, Ghumura, Giddha, Gondhal, Jawara ,Jhoomer, Kalbelia, Karakattam, Koli, Lavani, Naga dance, Odissi, Padhar, Raas.\n" +
                "If team wants to perform a form other than those mentioned above, they are required to contact the coordinators well in advance.\n" +
                "2. All forms of pure Indian classical dance forms are allowed.\n" +
                "3. We allow semiclassical styles provided there are distinctive classical elements are identied in the performance, amalgamated with other fusion styles. Contact the event coordinator in case of any queries.\n" +
                "4. The teams must bring CDs/ Pen-drive for the music (audio format).\n" +
                "5. Judging Criteria: Choreography, Synchronization, Expression, Creativity, Prop Usage, Costume, Energy, Stage coverage, and overall impact.\n" +
                "6. All props are allowed except for the following:\n" +
                "Swords, knives or any other sharp object (unless plastic - but must be approved prior to performance)\n" +
                "Fire in any form (candles, torches, etc)\n" +
                "Fog or smoke\n" +
                "Helium balloons\n" +
                "Special lighting\n" +
                "7. Time Limit:\n" +
                "Minimum : 7 minutes\n" +
                "Maximum : 10 minutes.\n" +
                "(One minute will be allowed in addition to maximumtime for setup and strike of props). 8. Team size:\n" +
                "Minimum : 6\n" +
                "Maximum : 15\n" +
                "Solo and Duet\n" +
                "1. All forms of pure Indian classical dance forms are allowed.\n" +
                "2. We allow semiclassical styles provided there are distinctive classical elements are identified in the performance, amalgamated with other fusion styles. Contact the event coordinator in case of any queries.\n" +
                "3. For folk, participants have to perform one of the following dance forms:\n" +
                "Alkap, Bhangra, Bhavai, Bihu, Cheraw (bamboo dance) , Chhau, Dhap, Dumhal, Gambhira,Garba (dandiya), Gaur dance, Ghoomar, Ghumura, Giddha, Gondhal, Jawara ,Jhoomer, Kalbelia, Karakattam, Koli, Lavani, Naga dance, Odissi, Padhar, Raas.\n" +
                "If participant wants to perform a form other than those mentioned above, they are required to contact the coordinators well in advance.\n" +
                "4. The participants must bring CDs/ Pen-drive for the music (audio format).\n" +
                "5. Time Limit:\n" +
                "Minimum : 4 minutes\n" +
                "Maximum : 6 minutes\n" +
                "(One minute will be allowed in addition to maximum time for setup and strike of props).\n" +
                "6. Judging Criteria: \n" +
                "Choreography, Synchronization (duet) , Expression, Creativity, Prop Usage, Costume, Energy, Stage coverage, and overall impact.\n" +
                "7. All props are allowed except for the following:\n" +
                "Swords, knives or any other sharp object (unless plastic - but must be approved prior to performance)\n" +
                "Fire in any form (candles, torches, etc)\n" +
                "Fog or smoke\n" +
                "Helium balloons\n" +
                "Special lighting\n" +
                "\n" +
                "In case of conflicts, decision of the judges would be considered final and binding\n";
        contacts = "Aditi Maheshwari +91-9717481156";
        danceEvents.add(new Events("Dance", "Anushthan", "BR Ambedkar Auditorium", "While Indian classical dance is an umbrella term for various codified art forms rooted in sacred Hindu musical theatre styles, the term “Folk dance” describes all forms of folk and tribal dances in regions across India. While Indian classical dance was considered a higher form of art and was practiced in courts, temples and on special occasions, folk dance forms were and are still practiced in groups in rural areas as an expression of the daily work and rituals of the common people during festivals. ",
                "13th February", "11:00 am", "  300/- per team\n" +
                "100/- per individual ", rules, contacts, "https://docs.google.com/forms/d/14BSTpjPltUJ6PtsajHY8R6HsdkO_ZVChDyg3RY780wg/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/anushthan/11058440_871279442935379_7185984909711420466_o.jpg"));

        rules = "ONE ON ONE POPPING BATTLE\n" +
                "1. The two participants be on opposite sides of the stage.\n" +
                "2. The songs played during the battle would be randomly played by the DJ. \n" +
                "3. There would be two rounds of performances during each battle. \n" +
                "4. There would not be any point system in the battle round. The winner would be announced after each battle by the judge’s discretion. \n" +
                "5. The time given to each contestant in the preliminary rounds would be approx. 30 seconds. \n" +
                "6. In the finals, the time limit for each performer in each round will be approx. 1 minute. \n" +
                "7. The judging criteria for the popping will be based on-\n" +
                "i) ORIGINAL POPPING MOVEMENTS (Foundation, Techniques and Variations of styles ex: Popping, Boogaloo, Tutting, Animation, Snaking etc...) \n" +
                "ii) CHARACTER AND CHARISMA (Eye contact and Interaction with environment) \n" +
                "iii) MUSICALITY (Pure Funk, Improvisation and Interaction with the music) \n" +
                "iv) STYLE AND GRACE (Execution and Demonstration of body control through balance, strength and range of motion) \n" +
                "v) ATTITUDE (No fear Confidence, High energy, Good sportsmanship. Ability to experiment through improvisation and making any mistakes into something, Focus on the music...not moves or worries!) \n" +
                "vi) FLOOR WORK (Within the Popping vocabulary) \n" +
                "vii) STAGE PRESENCE (Entertainment quality/Performance/Audience connection) \n" +
                "viii) CREATIVITY (....Add your flavor, Be Extraordinary) \n" +
                "\n" +
                "TWO ON TWO POPPING BATTLE\n" +
                "1. All preliminary rounds would be two rounds each and each performer would get approx. 30 seconds to perform.\n" +
                "2. In the final would, there would be 3 rounds. \n" +
                "3. The time limit for each performer during preliminary rounds would be approx. 30 seconds. \n" +
                "4. The time limit for each performer during the finals would be approx. 1 minute. \n" +
                "5. The music played by the DJ would be random and would feature funk, rap, break beats, electronica etc. \n" +
                "6. The judging would be non-point based and the sole discretion of the judge would decide who wins the round. \n" +
                "7. The result would depend upon the combined performance of both the team members.\n" +
                "\n" +
                "FOUR ON FOUR All styles BATTLE\n" +
                "1. The number of members in the crew should be 4.\n" +
                "2. Total time duration for the preliminary rounds would be 6 minutes. \n" +
                "3. The changeover between the crews would be done at a gap of 30 seconds. \n" +
                "4. The finals would feature a total time duration of 8 minutes. \n" +
                "5. Elements of breaking must be incorporated in the performance namely toprock, downrock, freezes and power moves along with other dance forms of hip hop. \n" +
                "6. The judging would not be point based and would be done on the discretion of the judge based on overall team performance. \n" +
                "\n" +
                "The rules and regulations are subject to change based on the discretion of the organizers. Kindly keep checking the official site of the ENGIFEST and STFU for any changes in the rules and procedures.\n" +
                "Information on the registration procedure, registration fee, and deadline for registration, prizes and venue would be put up separately on the website.\n" +
                "Note: The remaining categories will be final soon. Stay tuned.";
        contacts = "Aditi +91-7065142265\n" +
        "Arshiya +91-9818558592";
        danceEvents.add(new Events("Dance", "Switch The Funk Up", "OAT", "S.T.F.U (Switch the Funk up) is the street dance competition of Engifest which has become an established dance event in just an year of existence.\n" +
                "In this event, various street dancers will thrill you with their immaculate dancing styles. Be a part of the crowd that will witness some of the top dancers of our college battle it out for the prize. The competition will be judged by International world class dancers Boogie Frantick, Mighty ZULU Kings and The GR818ERS. So, get ready to witness the ultimate dancing event!!"
                , "15th February", "10:00 am", null, rules, contacts, null, false, "http://engifest.dtu.ac.in/events/stfu/stfu.jpg"));

        SugarRecord.saveInTx(danceEvents);


        List<Events> musicEvents = new ArrayList<>();


        rules = "Number Of Rounds: 3\n" +
                "Team Size: 3 - 6 members (All college students). At least one Percussionist and two different instruments\n" +
                "Elimination:\n" +
                "1. Bands will be required to send in at least one recorded original compositions and one cover at arpeggiobotb@gmail.com, latest by 9th February 2016. The mail must include name of the band, name and college names of the band members and one contact number.\n" +
                "2. The covers can be improvised.\n" +
                "Top 10 entries will be selected for the semi-finals.\n" +
                "Semi-Finals\n" +
                "1. Bands will be required to perform at-least one original composition\n" +
                "2. The time limit has been set at 15 minutes (including set up, sound check and clearance time)\n" +
                "Top 5 bands will be selected for the finals.\n" +
                "Finals\n" +
                "1. Bands will be required to perform at-least one original composition and one cover\n" +
                "2. The theme of the final round is: “Ace of Spades: A tribute to Lemmy Kilmister”\n" +
                "3. The time limit has been set at 20 minutes (including set up, sound check and clearance time)\n" +
                "The winner will be opening for the Rock Night\n" +
                "Rules\n" +
                "1. Obscenity (At the discretion of the judges) of any kind is not allowed.\n" +
                "2. Exceeding the time limit may affect judging criterion.\n" +
                "3. The participants are required to carry along with them their instruments and gears which include guitars, keyboards, processors, cymbals and stands.\n" +
                "4. A standard 5-piece drum kit, keyboard stand, cables and Microphones will be provided.\n" +
                "5. Vocal Processors are not allowed; any band using vocal processors will be disqualified straightaway.\n" +
                "6. The decision of the judges would be final and irreversible. ";
        contacts = "Rohan Raj +91-8800583640\n" +
                "Tathaghat Jha +91-8585922147\n" +
                "Sopandev Tiwari +91-9811537333";

        musicEvents.add(new Events("Music", "Battle Of Bands", "OAT", "“It's all about the game and how you play it\n" +
                "All about control and if you can take it”\n" +
                "If these lines instantly remind you of a deep, husky low-pitched growl, you have arrived at the right spot.\n" +
                "Engifest ’16, the annual cultural festival of Delhi Technological University invites you to an ear-shattering Arpeggio – Battle of the Bands. Let the cymbals clank, the guitars strum and the screams rattle Delhi-42! ",
                "14th February", "2:00 pm", null, rules, contacts, null, false, "http://engifest.dtu.ac.in/events/battle-of-bands/battle%20of%20bands.jpg"));



        rules = "Online Prelims\n" +
                "1. Time limit: 6 minutes, including set up.\n" +
                "2. One accompaniment allowed. Karaoke track is permitted.\n" +
                "3. A synthesizer and an acoustic guitar shall be provided. Participants have to bring any other instrument (if required).\n" +
                "4. Purely classical songs are not allowed.\n" +
                "Judging Criteria\n" +
                "Quality of singing, creativity, vocal range, clarity in lyrics and overall impact.";
        contacts = "Nikil James Paul +91-9643617174\n" +
                "Suhail Subair +91-7042673847\n" +
                "Yash Chauhan +91-9555650014";
        musicEvents.add(new Events("Music", "Engi Idol", "Convocation Hall", "Let your notes mesmerize everyone and win all hearts. If you've got the sur, the lay and the taal, let them do your talking.\n" +
                "Registration has to be done ONLINE ONLY. There will be NO on the spot registration. ",
                "13th February", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/13A53aS8Zl8Ap0n8tn65dokbdKwiPEuEXNf3QkjMgZYs/viewform?c=0&w=1&usp=send_form", false, "http://engifest.dtu.ac.in/events/engi-idol/1599855_667435116653147_1953477379_o.jpg"));



        rules = "1. Time limit: 10 minutes, including set up.\n" +
                "2. Group can comprise of 5-15 members (including the accompanists).\n" +
                "3. A maximum of 2 accompaniments are allowed.\n" +
                "4. A synthesizer shall be provided. Participants have to bring any other instrument(s) if required.\n" +
                "5. Beat-boxing is allowed.\n" +
                "Judging Criteria\n" +
                "Vocal dynamics, originality, creativity, coordination and overall impact. ";
        contacts = "Nikil James Paul +91-9643617174\n" +
                "Suhail Subair +91-7042673847\n" +
                "Yash Chauhan +91-9555650014";

        musicEvents.add(new Events("Music", "Vrind", "Convocation Hall", "Come, sing and conquer our hearts, because if it is music you're all about and melody's your weapon,then we're all up for it.\n" +
                "Participants can register both online and offline (on the spot). Only one person from a group should register. ",
                "13th February", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/14aTV6lFailmgKX-byD2tM9FcOF8VWVTGIdihWZwkHaY/viewform?c=0&w=1&usp=send_form", false, "http://engifest.dtu.ac.in/events/vrind/vrind.jpg"));



        rules = "Online Prelims\n" +
                "Send your recording (audio/video) or the link to your YouTube video to madhurima.western@gmail.com .\n" +
                "Rules\n" +
                "1. Time limit: 6 minutes, including set up.\n" +
                "2. One accompaniment allowed. Karaoke/Backing track is strictly NOT permitted.\n" +
                "3. A synthesizer and an acoustic guitar shall be provided. Participants have to bring any other instrument (if required).\n" +
                "4. Rap not allowed.\n" +
                "Judging Criteria\n" +
                "Quality of singing, creativity, vocal range, clarity in lyrics and overall impact.";
        contacts = "Nikil James Paul +91-9643617174\n" +
                "Suhail Subair +91-7042673847\n" +
                "Yash Chauhan +91-9555650014";

        musicEvents.add(new Events("Music", "Vocalicious", "Convocation Hall", "Does your hand itch to reach out for the mike? Is the stage your second home and the audience your second family? Then come, be a part of Vocalicious. The stage awaits you.\n" +
                "Registration has to be done ONLINE ONLY. There will be NO on the spot registration. ",
                "15th February", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1qabYx-der4tDNvUiYgn1B3eIeZTHFUSLPIGppHbDZlI/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/vocalicious/1966027_687808047949187_4492048074217824304_o.jpg"));




        rules = "1. Time limit: 10 minutes, including set up.\n" +
                "2. Group can comprise of 5-15 members.\n" +
                "3. Group can comprise of 5-15 members (including the accompanists).\n" +
                "4. A maximum of 2 accompaniments are allowed.\n" +
                "5. An acoustic guitar and a synthesizer shall be provided. Participants have to bring any other instrument(s) if required.\n" +
                "6. Beat-boxing is allowed.\n" +
                "Judging Criteria\n" +
                "Vocal dynamics, originality, creativity, coordination and overall impact.";
        contacts = "Nikil James Paul +91-9643617174\n" +
                "Suhail Subair +91-7042673847\n" +
                "Yash Chauhan +91-9555650014";

        musicEvents.add(new Events("Music", "Balladeers", "Convocation Hall",  "You're a note when you're alone, but a whole symphony when a group. Come, bring your harmonies to the stage and enthrall everyone with your compositions.\n" +
                "Participants can register both online and offline (on the spot). Only one person from a group should register.",
                "15th February", "10:00 am", null, rules, contacts,"https://docs.google.com/forms/d/1f6YOZZdKlPjpeWynY7hQuwLab9RuRX32w5G5kTPMoAc/viewform?c=0&w=1" ,false, "http://engifest.dtu.ac.in/events/balladeers/balladeers.jpg"));


        rules = "1. Time limit: 8 minutes, including set up.\n" +
                "2. There should be exactly three members in a team.\n" +
                "3. The three members have the freedom to sing and/or play any number of instruments.\n" +
                "4. A synthesizer, an acoustic guitar and a drum kit shall be provided. Participants have to bring any other instrument(s) if required.\n" +
                "5. Digital effects processors are allowed, however, use of loopers and digital rhythm patterns are strictly prohibited.\n" +
                "6. Beat boxing is allowed.\n" +
                "Judging Criteria\n" +
                "Originality, creativity, coordination and overall impact.";
        contacts = "Himanshu Makhija +91-9999727206\n" +
                "Shikhar Sachdeva +91-8447403102";

        musicEvents.add(new Events("Music", "Three's A Show", "OAT", "They say the best things in life come in threes. If you three think you're one of those things, you have the stage. Show us your magic.\n" +
                "Participants can register both online and offline (on the spot). Only one person from the team should register. ",
                "14th February", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1f6YOZZdKlPjpeWynY7hQuwLab9RuRX32w5G5kTPMoAc/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/three's-a-show/three.jpg"));

        SugarRecord.saveInTx(musicEvents);

        List<Events> dramaEvents = new ArrayList<>();


        rules = "1. The team size represents the number of people registered as a team. Only these shall be allowed to perform the street play.\n" +
                "2. Minimum of 8 actors are to be included in the team.\n" +
                "3. The time limit is 21 minute (empty stage to empty stage).\n" +
                "4. Music accompanists are included in the team number stated above.\n" +
                "5. Teams are expected to perform at an open air venue, on a circular stage with audience all around.\n" +
                "6. No electrical appliances shall be allowed during the performance, whether inside or outside the circle of performance.\n" +
                "7. Only live music is allowed. Teams will have to bring their own instruments - no instrument shall be provided.";
        contacts = "Vineet Maurya +91-9810383175 \n" +
                "Vaibhav Chauhan +91-9968733717 ";

        dramaEvents.add(new Events("Drama", "Nukkad", "Mech C Parking", "With any part you play there is a certain amount of yourself in it. There has tobe,otherwise it’s not acting.It’s lying.”The deep message wrapped in emotions, humor and energy is what nukkad is known for.The artists shall roar till their message spreads farand wide. ",
                "13th February", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1IyIiw3fiNSSAOkN4RqRG9r7RntglpPSZNGL_BNcoa34/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/nukkad/nukkad.jpg"));


        rules = "1. Performance should be in Hindi or English or both. However short sub - passages in other languages are allowed .\n" +
                "2. The total time of performance sound be between 35 to 50 minutes.\n" +
                "Top 10 entries will be selected for the semi-finals.\n" +
                "3. 4 chairs and 2 tables will be provided by our side.Any other production material has to be brought by the teams themselves but the organizers hold the discretion of allowing its inclusion on stage.\n" +
                "4. Stage Play comprises of multiple scenes and may have blackouts.\n" +
                "5. Backstage voiceovers and narrations are allowed during the performance.\n" +
                "6. Pre-recorded music is allowed and should be brought in a CD/DVD or a pen drive in .cda or .mp3 format only. (Other FORMATs may not be supported on the computer – use them at your own risk).";
        contacts = "Himanshu Makhija +91-9999727206\n" +
                "Shikhar Sachdeva +91-8447403102";

        dramaEvents.add(new Events("Drama", "Natya", "BR Ambedkar Auditorium", null,
                "15th February", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1u9UKgopLJuaWRgbSPhCp9LU_672BO_1Dhi1kxK9cRmo/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/natya/natya%20brochure.jpg"));

        SugarRecord.saveInTx(dramaEvents);


        List<Events> fashionEvents = new ArrayList<>();


        rules = "1. Only one entry per college is allowed.\n" +
                "2. It’s a team event, a team can have 12-15 members(including participants, choreographer, co-ordinator).\n" +
                "3. The event has two rounds - Western and Theme.\n" +
                "4. Time limit for each round will be 10 minutes including set up and performance.\n" +
                "5. Negative marks if time limit is exceeded.\n" +
                "6. Theme selection is open to the team.\n" +
                "7. Green room will be provided.\n" +
                "8. Teams shall carry their tracks with them.\n" +
                "9. Teams will be judged based on costumes, theme, walking stance and attitude.\n" +
                "10. Decision of the judges will be final and no discussion shall be held over it.\n" +
                "11. Creating nuisance ,consumption of alcohol smoking etc will lead to the debarment of the team. ";

        contacts = "Shubham Tyagi +91-8882653317 \n" +
                "Nalin Choudhary +91-8588001179 ";

        fashionEvents.add(new Events("Fashion", "Paridhan", "Sports Complex", "If you think you have it in you to set fire to the stage with thousands of eyes on each perfectly choreographed step you take on the ramp, this is where you belong ",
                "14th February", " 3:00 pm", null, rules, contacts, "https://docs.google.com/forms/d/1APUs55t67Me-nrSeuxViJEwPj9aoPQkRC--pFRI_11g/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/paridhan/paridhan.jpg"));

        fashionEvents.add(new Events("Fashion", "Campus Princess", "BR Ambedkar Auditorium", "Engifest 2k16 presents Campus Princess - a pageant wrapped up with infinite oomph and glamour. Campus Princess is a platform to bring out your raw talent and to introduce yourself as the most stunning and talented girl in the campus. With varied aspirations, passions and rock solid attitude, these girls are never going to bow down again. ",
                "13th February", "5:00 pm", null, null, null, "https://docs.google.com/forms/d/1SJX4dMjS_74xKTc_Tvpq3e0iigtE_nDP1SliRS5Kk-M/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/campus-princess/femina.jpg"));


        SugarRecord.saveInTx(fashionEvents);


        List<Events> proNightEvents = new ArrayList<>();

        proNightEvents.add(new Events("Pro Nights", "Rock Night", "Sports Complex", "\n" +
                "“Rock and roll is a nuclear blast of reality in a mundane world where no-one is allowed to be magnificent.” -Kim Fowley\n" +
                "Engifest’16 brings you some of the best rock talent in the country for a sonically exhilarating experience that will leave your senses absolutely spellbound! You won’t be able to resist banging your heads to the powerful beats and tapping your feet with the intense music; so overwhelmingly influencing will be the aura at this event! ",
                "14th February", "8:00 pm", null, null, null, null, false, "http://engifest.dtu.ac.in/events/rock-night/rock%20night.jpg"));

        proNightEvents.add(new Events("Pro Nights", "Livewire (Star Night)", "Sports Complex", "\"Bachna ae Haseeno\" \"Bombaii Nagariya\" se \"Ik Junoon\" leke do \"chokre Jawan\" aarhe hai jinhe sunke aap \"D se dance\" karne ko majhboor hojaenge. \n" +
                "\n" +
                "Yes, believe it. VISHAL DADLANI and SHEKHAR RAVJIANI The dynamic duo is here to set fire to the Engifest stage on February 13th in the Star Night with its enthralling compositions and riveting stage performance!\n" +
                "\n" +
                "Not only have they dropped the best romance singles one after the other (Read: ‘Tu Aashiqui Hai’, ‘Tujhe Bhula Diya’, ‘Jaane Kyun’ etc.); they have also given some amazing party anthems that you can’t resist busting a groove to! (Read: ‘Sheila Ki Jawani’, ‘Bachna Ae Haseeno’, ‘Criminal’ and ‘Desi Girl’).\n" +
                "\n" +
                "So guys, clear your schedules and brace yourselves. As this night you’ll learn to party, Engifest style.\n" +
                "\n" +
                "A big shout out to OJAS Entertainment for making this memorable event possible! Thank you for all the help and support you have provided for this to happen smoothly.\n",
                "13th February", "8:00 pm", null, null, null, null, false, "http://engifest.dtu.ac.in/assets/main/vs-cover.jpg"));

        proNightEvents.add(new Events("Pro Nights", "EDM Night", "Sports Complex", "EDM- what once developed from a small culture and now one of the biggest music culture of the world.Hardwell, Garrix, Guetta being just a few names.\n" +
                "With the catchy beats and the electrifying rhythm, Engifest 2k16 endeavors a night in our own campus, where each head will keep banging and every feet will groove under the electric sky. The moment when you'll realize EDM is not music anymore it's a lifestyle. YOLO..!!!",
                "15th February", "8:00 pm", null, null, null, null, false, "http://engifest.dtu.ac.in/events/edm-night/edm%20night.jpg"));


        SugarRecord.saveInTx(proNightEvents);

        List<Events> literaryEvents = new ArrayList<>();


        rules = "1. Each team shall consist of 3 speakers and 1 adjucator.\n" +
                "2. The Formal followed would be a one vs one Knockout PD.\n" +
                "3. Each team has to prepare and send a résumé to sahitya.dtu@gmail.com . Teams will be shortlisted on the basis of their résumé.\n" +
                "4. The Asian format of Parliamentary Debate will be followed.\n" +
                "5. The deadline for registration is 20th January '16.";
        contacts = "Vidushi Tyagi +91-9871739158 \n" +
                "Pooja Chopra +91-8860836738 ";

        literaryEvents.add(new Events("Literary", "Parliamentary Debate", "Mech Block", "A standard Asian format Parliamentary Debate competition, this event is assured to be a fierce battle of wit and words, designed to challenge and enhance the contestants’ debating prowess and their teamwork ability.",
                "13th February", "11:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1v0aiBC8-hb0xxZ4EUiXITfXjhhBMh4AsmH_OxNpBHz0/viewform", false, "http://engifest.dtu.ac.in/events/parliamentary-debate/12509685_527477990746703_2564655962457361401_n.jpg"));


        rules = "The rules of the game are simple and will be told to on the spot by the JAM master - the judge of the event.\n" +
                "The most common rules are mentioned here:\n" +
                "1. You CANNOT be boring.\n" +
                "2. You have to be grammatically correct. \n" +
                "3. Queens English is a MUST.\n" +
                "4. You cannot hesitate.\n" +
                "You will be judged based on wit, humor, spontaneity and various other criteria that depend solely on the discretion of the JAM master. ";
        contacts = "Aditya +91-9711763847 \n" +
                "Mudit +91-9971200645";

        literaryEvents.add(new Events("Literary", "Just A Minute", "Science Block", "Get ready for this fast paced, 60 second linguistic thriller! This battle tests your quick thinking, speaking ability and command over the English language. You will be pitted against several students in this war zone and no mercy will be shown. Get ready for this year most EPIC battle. You got a minute to win it.\n" +
                "The game is divided into two stages:\n" +
                "1. Basically in this stage groups of 8 or 9, depending on the number of players present during the event, will be formed. A face off will be held and the one with the most points qualify.\n" +
                "2. The winners of each group will go against each other and following the same pattern (obviously), the one with the most points will win.\n" +
                "There are various different rounds that the participant may have to take part in. The examples include the Rhyme round, Disconnect round, Alphabetical round and many more.",
                "13th February", "3:00 pm", null, rules, contacts, "https://docs.google.com/forms/d/1paDU0tupxvIyikhOrx7PlJ8686VfLCLxTHSm7gaVQDY/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/jam/JAM_Poster__1453748765_106.215.169.37.jpg"));

        rules = "1. Download Fluttr from Google Play Store: http://getfluttr.com/mobile.\n" +
                "2. Post your entries in the channel \"Sahitya - DTU Creative Writing Competition\" in 'Discover' section. iOS and Windows phone users may send in their entries at sahitya.dtu@gmail.com \n" +
                "3. Mention your email ID and contact number. You'll be informed about your selection by 11th February.\n" +
                "Entries shall be accepted in Hindi and English only.";
        contacts = "Abuzar Jamal +91-9810682595 \n" +
                "Ishna Kaul +91-9953148879 ";

        literaryEvents.add(new Events("Literary", "Creative Writing", "Science Block", "The online preliminaries are as follows:\n" +
                "Compose a paragraph/poem/prose in 400 characters (NOT WORDS, CHARACTERS) on the topic \"Mirror or दर्पण\" and send it to us by February 10, midnight.\n" +
                "The selected entries shall face a tougher battle in the offline round on February 13 at DTU campus.",
                "13th February", "11:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1NYwgqiHztVTDxNs5Vs3XEumiesGioh7z6FUvzojNnOM/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/creative-writing/12565466_529379543889881_5506223773677176857_n.jpg"));

        rules = "1. Each team shall consist of 3 speakers and 1 adjucator.\n" +
                "2. The Formal followed would be a one vs one Knockout PD.\n" +
                "3. Each team has to prepare and send a résumé to sahitya.dtu@gmail.com . Teams will be shortlisted on the basis of their résumé.\n" +
                "4. The Asian format of Parliamentary Debate will be followed.\n" +
                "5. The deadline for registration is 20th January '16.";
        contacts = "Anmol Bharaj +91-9717509414 \n" +
                "Ishaa Bishnoi +91-9910077616 ";

        literaryEvents.add(new Events("Literary", "Mixed Bag", "Science Block\n", "A Word Games event, this is the ultimate amalgamation of literary, lingual and logical hurdles for all the master of all trades out there!\n" +
                "The rules are pretty simple:\n" +
                "The event comprises of only one round, which will be in the form of 1.5 hours written test, where we test your word power and creativity with an array of out of box questions.\n" +
                "Three members maximum allowed in team. Lone wolves allowed as well.\n" +
                "This is the event where you battle for the title of the 'Ultimate Master of Words'!",
                "14th February", "11:00 am", null, null, contacts, "https://docs.google.com/forms/d/1wSeSWTFECh1FG3M5I-RDKQ8sFb5un0gY5vg4VOgEa_4/viewform?c=0&w=1", false, "http://engifest.dtu.ac.in/events/mixed-bag/12439329_530588460435656_2325362346917674574_n.jpg"));

        SugarRecord.saveInTx(literaryEvents);
        List<Events> miscEvents = new ArrayList<>();

        miscEvents.add(new Events("Miscellaneous", "Shakedown", "Hostel Road",  "The whirr of tyres speeding down the tracks; the feel of vintage bikes driving by you… Yes! SHAKEDOWN, the most anticipated event of Engifest’16 is here!\n" +
                "Presented by Souls of Speed, Shakedown is one-of-a-kind roadshow- a spectacle which would leave you enticed. Jaws will drop and eyes will widen, as daredevil stunts are pulled off with ease and style! ",
                "14th February", "12:00 pm", null, null, null, null, false, "http://engifest.dtu.ac.in/events/shakedown/Shakedown.jpg"));

        rules = "Team size: At most 15 (including the actors)\n" +
                "Time Limit: 5 to 15 minutes\n" +
                "Theme: Coincidence (Theme is open to interpretation)\n" +
                "Judging Criteria: Editing, Cinematography, Script, Acting, Sound design and Overall impact.\n" +
                "1. The movies should be either in Hindi or English or both.\n" +
                "2. If you choose to make a film in Hindi, it must contain English subtitles.\n" +
                "3. No other languages will be allowed.\n" +
                "4. Please note that we will not be responsible for postal delays, losses or damages–make sure you send in entries sufficiently before the deadline.\n" +
                "5. You may use any video camera you deem suitable for shooting the movie.";
        contacts = "Adil Haris +91-7042364785 \n" +
                "Ayush Goel +91-9999888200 ";

        miscEvents.add(new Events("Miscellaneous", "Kaleidoscope", "Edusat Hall",  "Short film making competition, where the theme will be provided a month before engifest. Handpicked Entries will be screened at the venue with the presence of the judges. ",
                "14th February", "10:00 am", null, rules, contacts, "https://goo.gl/forms/fZuODXpy9B", false, "http://engifest.dtu.ac.in/events/kaleidoscope/11163111_887505434646113_4947505584396171817_o.jpg"));

        miscEvents.add(new Events("Miscellaneous", "Kumar Vishwas Live", "OAT",  "A poet, a writer, a politician, an inspiration. \n" +
                "With his extraordinary recitation skills, he engulfs the crowd in his own mesmerizing aura. With the stellar power of his presentation, he sends hard-hitting messages encased in bittersweet words.\n" +
                "Ladies and gentlemen, Engifest’16 presents to you KUMAR VISHWAS, a motivator, a craftsman, who brought in a breath of fresh air to Hindi Poetry with his innovative, intense words and transformed the way the Indian youth looks at poetry, forever. ",
                "15th February", "5:00 pm", null, null, null, null, false, "http://engifest.dtu.ac.in/events/kumar-vishwas-live/744c20a2-9638-4cd1-a20c-a477f18f8ab4.jpg"));

        rules = "1. No costumes or props will be provided. \n" +
                "2. For the FIRST ROUND, participants will be asked to walk the ramp with given props. \n" +
                "3. For the SECOND ROUND, the participants will introduce themselves in not more than two-three lines. This introduction will then be followed by TALENT SHOW. Any sound track used for this round must be brought in a Pen Drive. Time limit- 3 minutes. \n" +
                "4. Participants have to ensure that one copy of their track is with the event coordinator and one copy as a backup, is present with them. \n" +
                "5. Marks will be deducted in case of a time limit violation. \n" +
                "6. The THIRD ROUND will be a question and answer round. \n" +
                "7. Vulgarity in any form will not be allowed. \n" +
                "8. It is the contestant’s duty to be careful and aware of the order of performance. \n" +
                "9. Order of performance will be decided by the organisers. \n" +
                "10. The judges’ decision is final and binding on all. ";
        miscEvents.add(new Events("Miscellaneous", "Mr and Miss Engifest", "Mini OAT", "Engifest brings to you, Mr. and Ms. Engifest! A contest that celebrates poise and grace; Mr. and Ms. Engifest looks for those who bring a certain style to their spontaneity, who believe being themselves is the best trend they can set. \n" +
                "The online preliminary round is open, so email your best picture before February 10, 2016 to engifest2016@gmail.com with your name and college, and a caption describing yourself; and we’ll upload them here. Try to get the maximum likes possible on your picture (Note: A like is counted only if the Engifest page has been liked too). 10 Girls and 10 Boys will be selected from the online round on the basis of the number of likes and will participate on the final day of event. ",
                "15th February", "12:00 pm", null, rules, null, null, false, "http://engifest.dtu.ac.in/events/mr-miss-engi/12622284_836983303094051_7134114369520794596_o.jpg"));


        rules = "Team Size: 2 per team, cross college teams allowed";
        contacts = "Bhavesh +91-8447587727\n" +
                "Suyash +91-7838912711";
        miscEvents.add(new Events("Miscellaneous", "The Engi Quiz", "Edusat Hall", "Engifest'16 in association with Quizzing Inc presents \"The Engi Quiz\".\n" +
                "On the very first day of the fest, get your wits sharpened and knowledge replenished for you'll need every bit of your grey cells to crack this nut.\n" +
                "A general quiz spread over 9 rounds with two prelims slots to thoroughly test your mental faculties giving you a chance to win awesome prizes including up to 15,000 in cash!"
                ,"13th February", "12:00 pm", "50/- per team", rules, contacts, "http://www.quizzinginc.com/pages/events/event_detail/MTA=/The_Engi_Quiz", false, "http://engifest.dtu.ac.in/events/the-engi-quiz/the%20engi%20quiz.jpg"));

        contacts = "9971492977, 8800564772";
        miscEvents.add(new Events("Miscellaneous", "Red Street", "Red Street Area Behind Night Canteen",  "The Creative Arts Society of DTU brings to you the \"Red Street \" , A Magical new place where all the art Events will be taking place during Engifest ,blended in the colors of Red and Black .Delve into the depths of the mesmerizing Graffiti of Kalakriti Society, a blend of themes Villians, Valentine and Love.Red Street will also be having a 'Confessions Board' to write whatever is in your heart, Open for all 24 hours, write anything about anyone \n\n" + "Nail'd It\n 1. Both \"Group\" or \"Solo\" entries are graciously invited.\n" +
                "2. Participants would be provided with a wooden board upon which many nails would be put . Participants are supposed to tie coloured threads on the nails so as to form initials of any name and blend in a design. Participants would be provided with all the required materials on the spot.\n" +
                "3. Top 3 Masterpieces would be awarded based on creativity and relevance to the theme that is Villians with a pinch of Love. Gear-up your mind with ideas and indulge it in love to give a perfect piece of art !\n" +
                "Date: 13 Feb\n" +
                "Time: 11:00 am\n\n"+ "Collage Making\n1. \"Solo\" as well as group entries are invited.\n" +
                "2. Participants would be provided with glazed papers of three colors of their choice , white sheet and glue .Participants are supposed to tear the papers and make a collage on the theme \"VILLAINS\" . Participants would be provided with all the required materials on the spot.\n" +
                "3. Top 3 Masterpieces would be awarded based on creativity and relevance to the theme . Gear-up your mind with ideas !! Tear and Paste to give a perfect piece of art !\n" +
                "Date: 13 Feb\n" +
                "Time: 1:00 pm\n\n"+"Wasted \nMake a swachh Move\n" +
                "Kalakriti-TheFine Arts Society of DTU brings to you WASTED : Painting with waste material competition.\n" +
                "Recycle waste material. Use your creativity and paint with all kinds of waste materials. Embellish with colours to make the best out of waste.\n" +
                "Waste material will be provided at the venue along with colours and any other tools required.\n" +
                "Date: 13 Feb\n" +
                "Time: 10:00 am\n" +
                "Venue: Red Street Area Near DTU Library\n\n"+"Clay Modelling \nCraft out of clay . Make Artifacts and have fun with clay modelling . Play with clay and show the art genius in you ! Come to be a part of exciting creativity and witness art Each participant will be given clay, toothpicks and ice-cream sticks\n" +
                "Date: 14 Feb\n" +
                "Time: 10:00 am\n" +
                "Venue: Red Street Area Near Night Canteen",
                "13th February", "11:00 am", null, null, contacts, null, false, "http://engifest.dtu.ac.in/events/red-street/kalakriti.jpg"));


        contacts = "Ayush Bhatia +91-9560059669";
        miscEvents.add(new Events("Informal Events", "Informal Events", "Mech C. First Floor", "Poker Night\n" +
                "One table, a deck of cards & a game of poker. Enticing already, isn't it? Well, Engifest’16 presents to you POKER NIGHT, a contest replete with vigor and the will to win; where you test your wit and LUCK. So use your poker face, and raise the stakes with your stellar flair!\n" +
                "Date: 14, 15 Feb\n" +
                "Time: 11.00 am\n" +
                "Venue: Mech C. First Floor \n" +
                "\n" +
                "Fun City \n" +
                "Prom Night \n" +
                "Cultural Midnight\n" +
                "Online Photography",
                "14th and 15th February", "11.00 am", null, null, contacts, null, false, "http://engifest.dtu.ac.in/events/informal/informal.png"));


        SugarRecord.saveInTx(miscEvents);



    }

}
