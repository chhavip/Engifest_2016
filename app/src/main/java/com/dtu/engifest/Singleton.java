package com.dtu.engifest;

import com.dtu.engifest.models.Category;
import com.dtu.engifest.models.Contact;
import com.dtu.engifest.models.Events;
import com.dtu.engifest.models.Sponsors;
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
        caregories.add(new Sponsors("Miscellaneous", R.drawable.misc));
        caregories.add(new Sponsors("Informal Events", R.drawable.inf));

        SugarRecord.saveInTx(caregories);

        List<Events> danceEvents = new ArrayList<>();
        String rules;
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        rules = "1. There will be two rounds The first one will be video shortlisting and the second will be the final performance on the campus premises.\n" +
                "2. Only college students are allowed.\n" +
                "3. Last date of online registration is 08/02/16. On the spot registrations will not be entertained.\n" +
                "4. Any props/costumes if to be used should be arranged by the participants. Use of fire or any other inflammable object is restricted.\n" +
                "5. Time limit is 2-4 minutes.\n" +
                "6. Qualified participants have to ensure that one copy of their edited song is with the event head and one copy they should carry with them. Song should be in .mp3 format. Also, it is the contestant's duty to be careful and aware of the order of performance and should be present 15 minutes before the allotted time.\n" +
                "7. All the participants are required to carry their identity cards to the campus on the day of the event.\n" +
                "8. The organizing committee reserves the right to change the venue, time and rules, if required.\n" +
                "9. The decision of the judges will be final and binding. ";
        danceEvents.add(new Events("Dance", "Spandan (Solo)", "OAT", "Dance is the language of the soul and ENGIFEST'16 gives every soul a beautiful platform to express, a competitive environment for every dancer to showcase their talent.Calling out to all dance enthusiasts to dance their hearts out. Whatever your style be - jazz, hip hop, contemporary, classical or freestyle, SPANDAN gives you a chance to showcase your hidden talent and passion. ", "13th Feb"
                , "10 AM", "100/team", rules, contacts, "https://docs.google.com/forms/d/1toE-wWFwzpsZRdIHI_qy15BznyKX6Xb2JWWXqqU_La4/viewform?c=0&w=1&usp=send_form", false));

        rules = "1. There will be two rounds The first one will be video shortlisting and the second will be the final performance on the campus premises.\n" +
                "2. There is no restriction on the theme. It's an Open theme Group Dance Competition.\n" +
                "3. Maximum 1 team per college allowed.\n" +
                "4. Decision of the judges and the Organising Committee will be final and binding.\n" +
                "5. No responsibility will be held by DTU for any late or lost entries or any such events.\n" +
                "6. Team size should not be more than 20. However there must be at least 6 members on stage at any point during the performance.";

        danceEvents.add(new Events("Dance", "Spandan (Group)", "BR Ambedkar Auditorium", "Dancing together is different feet moving to the same beats. So move your feet in synergy and leave a lasting impression on the audience. We invite you to a fleeting moment where you feel alive, to enchant the crowd with your vibrant rhythm and to claim the Spandan crown. ",
                "14th Feb", "12:00 pm", " 300 / team", rules, contacts, "https://docs.google.com/forms/d/1bn0BW9Z1LpaZpHkkFtc6SbeHUtkKoBIbLF35VmZy-go/viewform?c=0&w=1", false));



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
        danceEvents.add(new Events("Dance", "Anushthan", "BR Ambedkar Auditorium", "While Indian classical dance is an umbrella term for various codified art forms rooted in sacred Hindu musical theatre styles, the term “Folk dance” describes all forms of folk and tribal dances in regions across India. While Indian classical dance was considered a higher form of art and was practiced in courts, temples and on special occasions, folk dance forms were and are still practiced in groups in rural areas as an expression of the daily work and rituals of the common people during festivals. ",
                "13th Feb", "11:00 am", "  300/- per team\n" +
                "    100/- per individual ", rules, contacts, "https://docs.google.com/forms/d/14BSTpjPltUJ6PtsajHY8R6HsdkO_ZVChDyg3RY780wg/viewform?c=0&w=1", false));


        danceEvents.add(new Events("Dance", "STFU", true));

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

        musicEvents.add(new Events("Music", "Battle Of Bands", "OAT", "“It's all about the game and how you play it\n" +
                "All about control and if you can take it”\n" +
                "If these lines instantly remind you of a deep, husky low-pitched growl, you have arrived at the right spot.\n" +
                "Engifest ’16, the annual cultural festival of Delhi Technological University invites you to an ear-shattering Arpeggio – Battle of the Bands. Let the cymbals clank, the guitars strum and the screams rattle Delhi-42! ",
                "14 Feb", "2:00 pm", null, rules, contacts, null, false));



        rules = "Online Prelims\n" +
                "1. Time limit: 6 minutes, including set up.\n" +
                "2. One accompaniment allowed. Karaoke track is permitted.\n" +
                "3. A synthesizer and an acoustic guitar shall be provided. Participants have to bring any other instrument (if required).\n" +
                "4. Purely classical songs are not allowed.\n" +
                "Judging Criteria\n" +
                "Quality of singing, creativity, vocal range, clarity in lyrics and overall impact.";
        musicEvents.add(new Events("Music", "Engi Idol", "Convocation Hall", "Let your notes mesmerize everyone and win all hearts. If you've got the sur, the lay and the taal, let them do your talking.\n" +
                "Registration has to be done ONLINE ONLY. There will be NO on the spot registration. ",
                "13 Feb", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/13A53aS8Zl8Ap0n8tn65dokbdKwiPEuEXNf3QkjMgZYs/viewform?c=0&w=1&usp=send_form", false));



        rules = "1. Time limit: 10 minutes, including set up.\n" +
                "2. Group can comprise of 5-15 members (including the accompanists).\n" +
                "3. A maximum of 2 accompaniments are allowed.\n" +
                "4. A synthesizer shall be provided. Participants have to bring any other instrument(s) if required.\n" +
                "5. Beat-boxing is allowed.\n" +
                "Judging Criteria\n" +
                "Vocal dynamics, originality, creativity, coordination and overall impact. ";
        musicEvents.add(new Events("Music", "Vrind", "Convocation Hall", "Come, sing and conquer our hearts, because if it is music you're all about and melody's your weapon,then we're all up for it.\n" +
                "Participants can register both online and offline (on the spot). Only one person from a group should register. ",
                " 13 Feb", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/14aTV6lFailmgKX-byD2tM9FcOF8VWVTGIdihWZwkHaY/viewform?c=0&w=1&usp=send_form", false));



        rules = "Online Prelims\n" +
                "Send your recording (audio/video) or the link to your YouTube video to madhurima.western@gmail.com .\n" +
                "Rules\n" +
                "1. Time limit: 6 minutes, including set up.\n" +
                "2. One accompaniment allowed. Karaoke/Backing track is strictly NOT permitted.\n" +
                "3. A synthesizer and an acoustic guitar shall be provided. Participants have to bring any other instrument (if required).\n" +
                "4. Rap not allowed.\n" +
                "Judging Criteria\n" +
                "Quality of singing, creativity, vocal range, clarity in lyrics and overall impact.";
        musicEvents.add(new Events("Music", "Vocalicious", "Convocation Hall", "Does your hand itch to reach out for the mike? Is the stage your second home and the audience your second family? Then come, be a part of Vocalicious. The stage awaits you.\n" +
                "Registration has to be done ONLINE ONLY. There will be NO on the spot registration. ",
                "15 Feb", "10:00 am", null, rules, contacts, null, false));



        rules = "";
        musicEvents.add(new Events("Music", "Battle Of Bands", "OAT", "“It's all about the game and how you play it\n" +
                "All about control and if you can take it”\n" +
                "If these lines instantly remind you of a deep, husky low-pitched growl, you have arrived at the right spot.\n" +
                "Engifest ’16, the annual cultural festival of Delhi Technological University invites you to an ear-shattering Arpeggio – Battle of the Bands. Let the cymbals clank, the guitars strum and the screams rattle Delhi-42! ",
                "14 Feb", "2:00 pm", null, rules, contacts, "https://docs.google.com/forms/d/1qabYx-der4tDNvUiYgn1B3eIeZTHFUSLPIGppHbDZlI/viewform?c=0&w=1", false));



        rules = "1. Time limit: 10 minutes, including set up.\n" +
                "2. Group can comprise of 5-15 members.\n" +
                "3. Group can comprise of 5-15 members (including the accompanists).\n" +
                "4. A maximum of 2 accompaniments are allowed.\n" +
                "5. An acoustic guitar and a synthesizer shall be provided. Participants have to bring any other instrument(s) if required.\n" +
                "6. Beat-boxing is allowed.\n" +
                "Judging Criteria\n" +
                "Vocal dynamics, originality, creativity, coordination and overall impact.";
        musicEvents.add(new Events("Music", "Balladeers", "Convocation Hall",  "You're a note when you're alone, but a whole symphony when a group. Come, bring your harmonies to the stage and enthrall everyone with your compositions.\n" +
                "Participants can register both online and offline (on the spot). Only one person from a group should register.",
                "15 Feb", "10:00 am", null, rules, contacts,"https://docs.google.com/forms/d/1f6YOZZdKlPjpeWynY7hQuwLab9RuRX32w5G5kTPMoAc/viewform?c=0&w=1" ,false));


        rules = "1. Time limit: 8 minutes, including set up.\n" +
                "2. There should be exactly three members in a team.\n" +
                "3. The three members have the freedom to sing and/or play any number of instruments.\n" +
                "4. A synthesizer, an acoustic guitar and a drum kit shall be provided. Participants have to bring any other instrument(s) if required.\n" +
                "5. Digital effects processors are allowed, however, use of loopers and digital rhythm patterns are strictly prohibited.\n" +
                "6. Beat boxing is allowed.\n" +
                "Judging Criteria\n" +
                "Originality, creativity, coordination and overall impact.";
        musicEvents.add(new Events("Music", "Three's A Show", "OAT", "They say the best things in life come in threes. If you three think you're one of those things, you have the stage. Show us your magic.\n" +
                "Participants can register both online and offline (on the spot). Only one person from the team should register. ",
                "14 Feb", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1f6YOZZdKlPjpeWynY7hQuwLab9RuRX32w5G5kTPMoAc/viewform?c=0&w=1", false));

        SugarRecord.saveInTx(musicEvents);

        List<Events> dramaEvents = new ArrayList<>();


        rules = "1. The team size represents the number of people registered as a team. Only these shall be allowed to perform the street play.\n" +
                "2. Minimum of 8 actors are to be included in the team.\n" +
                "3. The time limit is 21 minute (empty stage to empty stage).\n" +
                "4. Music accompanists are included in the team number stated above.\n" +
                "5. Teams are expected to perform at an open air venue, on a circular stage with audience all around.\n" +
                "6. No electrical appliances shall be allowed during the performance, whether inside or outside the circle of performance.\n" +
                "7. Only live music is allowed. Teams will have to bring their own instruments - no instrument shall be provided.";

        dramaEvents.add(new Events("Drama", "Nukkad", "Mech C Parking", "With any part you play there is a certain amount of yourself in it. There has tobe,otherwise it’s not acting.It’s lying.”The deep message wrapped in emotions, humor and energy is what nukkad is known for.The artists shall roar till their message spreads farand wide. ",
                "13th Feb", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1IyIiw3fiNSSAOkN4RqRG9r7RntglpPSZNGL_BNcoa34/viewform?c=0&w=1", false));


        rules = "1. Performance should be in Hindi or English or both. However short sub - passages in other languages are allowed .\n" +
                "2. The total time of performance sound be between 35 to 50 minutes.\n" +
                "Top 10 entries will be selected for the semi-finals.\n" +
                "3. 4 chairs and 2 tables will be provided by our side.Any other production material has to be brought by the teams themselves but the organizers hold the discretion of allowing its inclusion on stage.\n" +
                "4. Stage Play comprises of multiple scenes and may have blackouts.\n" +
                "5. Backstage voiceovers and narrations are allowed during the performance.\n" +
                "6. Pre-recorded music is allowed and should be brought in a CD/DVD or a pen drive in .cda or .mp3 format only. (Other FORMATs may not be supported on the computer – use them at your own risk).";
        dramaEvents.add(new Events("Drama", "Natya", "BR Ambedkar Auditorium", null,
                "15th Feb", "10:00 am", null, rules, contacts, "https://docs.google.com/forms/d/1u9UKgopLJuaWRgbSPhCp9LU_672BO_1Dhi1kxK9cRmo/viewform?c=0&w=1", false));

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

        fashionEvents.add(new Events("Fashion", "Paridhan", "Sports Complex", "If you think you have it in you to set fire to the stage with thousands of eyes on each perfectly choreographed step you take on the ramp, this is where you belong ",
                "14th Feb", " 3:00 pm", null, rules, contacts, "https://docs.google.com/forms/d/1APUs55t67Me-nrSeuxViJEwPj9aoPQkRC--pFRI_11g/viewform?c=0&w=1", false));

        fashionEvents.add(new Events("Fashion", "Campus Princess", "BR Ambedkar Auditorium", "Engifest 2k16 presents Campus Princess - a pageant wrapped up with infinite oomph and glamour. Campus Princess is a platform to bring out your raw talent and to introduce yourself as the most stunning and talented girl in the campus. With varied aspirations, passions and rock solid attitude, these girls are never going to bow down again. ",
                "13 Feb", "5:00 pm", null, null, null, "https://docs.google.com/forms/d/1SJX4dMjS_74xKTc_Tvpq3e0iigtE_nDP1SliRS5Kk-M/viewform?c=0&w=1", false));


        SugarRecord.saveInTx(fashionEvents);


        List<Events> proNightEvents = new ArrayList<>();

        proNightEvents.add(new Events("Pro Nights", "Rock Night", "Sports Complex", "\n" +
                "“Rock and roll is a nuclear blast of reality in a mundane world where no-one is allowed to be magnificent.” -Kim Fowley\n" +
                "Engifest’16 brings you some of the best rock talent in the country for a sonically exhilarating experience that will leave your senses absolutely spellbound! You won’t be able to resist banging your heads to the powerful beats and tapping your feet with the intense music; so overwhelmingly influencing will be the aura at this event! ",
                "14 Feb", "8:00 pm", null, null, null, null, false));

        proNightEvents.add(new Events("Pro Nights", "Livewire (Star Night)", "Sports Complex", "Live Wire is the main attraction of Engifest'2016 where a popular singer/band captivates the gigantic audience with their breathtaking music. The energy and enthusiasm around Live Wire is unmatched and the atmosphere is electric. Having featured popular singers like Mohit Chauhan in the past, Live Wire'16 will surely entrance and dazzle you. Get ready to be captivated by Live Wire'16, which will surely be a night you will never forget. ",
                "13 Feb", "8:00 pm", null, null, null, null, false));

        proNightEvents.add(new Events("Pro Nights", "EDM Night", "Sports Complex", "EDM- what once developed from a small culture and now one of the biggest music culture of the world.Hardwell, Garrix, Guetta being just a few names.\n" +
                "With the catchy beats and the electrifying rhythm, Engifest 2k16 endeavors a night in our own campus, where each head will keep banging and every feet will groove under the electric sky. The moment when you'll realize EDM is not music anymore it's a lifestyle. YOLO..!!!",
                "15 Feb", "8:00 pm", null, null, null, null, false));


        SugarRecord.saveInTx(proNightEvents);

        List<Events> miscEvents = new ArrayList<>();

        miscEvents.add(new Events("Miscellaneous", "Shakedown", "Hostel Road",  "The whirr of tyres speeding down the tracks; the feel of vintage bikes driving by you… Yes! SHAKEDOWN, the most anticipated event of Engifest’16 is here!\n" +
                "Presented by Souls of Speed, Shakedown is one-of-a-kind roadshow- a spectacle which would leave you enticed. Jaws will drop and eyes will widen, as daredevil stunts are pulled off with ease and style! ",
                "14 Feb", "12:00 pm", null, null, null, null, false));

        rules = "Team size: At most 15 (including the actors)\n" +
                "Time Limit: 5 to 15 minutes\n" +
                "Theme: Coincidence (Theme is open to interpretation)\n" +
                "Judging Criteria: Editing, Cinematography, Script, Acting, Sound design and Overall impact.\n" +
                "1. The movies should be either in Hindi or English or both.\n" +
                "2. If you choose to make a film in Hindi, it must contain English subtitles.\n" +
                "3. No other languages will be allowed.\n" +
                "4. Please note that we will not be responsible for postal delays, losses or damages–make sure you send in entries sufficiently before the deadline.\n" +
                "5. You may use any video camera you deem suitable for shooting the movie.";
        miscEvents.add(new Events("Miscellaneous", "Kaleidoscope", "Edusat Hall",  "Short film making competition, where the theme will be provided a month before engifest. Handpicked Entries will be screened at the venue with the presence of the judges. ",
                "14th Feb", "10:00 am", null, rules, contacts, "https://goo.gl/forms/fZuODXpy9B", false));

        miscEvents.add(new Events("Miscellaneous", "Mr and Miss Engifest", true));
        SugarRecord.saveInTx(miscEvents);



    }

}
