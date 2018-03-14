package com.duyquang.week3;

import android.app.Application;


/**
 * Created by nampham on 3/10/18.
 */

public class MyApp extends Application {

    private static final String TAG = MyApp.class.getSimpleName();

    private static String msgMovie;

    @Override
    public void onCreate() {
        super.onCreate();
        msgMovie = "{\"results\":[{\"vote_count\":2175,\"id\":399055,\"video\":true,\"vote_average\":7.4,\"title\":\"The Shape of Water\",\"popularity\":425.381582,\"poster_path\":\"\\/k4FwHlMhuRR5BISY2Gm2QZHlH5Q.jpg\",\"original_language\":\"en\",\"original_title\":\"The Shape of Water\",\"genre_ids\":[18,14,10749],\"backdrop_path\":\"\\/rgyhSn3mINvkuy9iswZK0VLqQO3.jpg\",\"adult\":false,\"overview\":\"An other-worldly story, set against the backdrop of Cold War era America circa 1962, where a mute janitor working at a lab falls in love with an amphibious man being held captive there and devises a plan to help him escape.\",\"release_date\":\"2017-12-01\"},{\"vote_count\":2544,\"id\":284054,\"video\":false,\"vote_average\":7.4,\"title\":\"Black Panther\",\"popularity\":271.475765,\"poster_path\":\"\\/uxzzxijgPIY7slzFvMotPv8wjKA.jpg\",\"original_language\":\"en\",\"original_title\":\"Black Panther\",\"genre_ids\":[28,12,14,878],\"backdrop_path\":\"\\/b6ZJZHUdMEFECvGiDpJjlfUWela.jpg\",\"adult\":false,\"overview\":\"After the events of Captain America: Civil War, King T'Challa returns home to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne from factions within his own country. When two foes conspire to destroy Wakanda, the hero known as Black Panther must team up with C.I.A. agent Everett K. Ross and members of the Dora Milaje, Wakandan special forces, to prevent Wakanda from being dragged into a world war.\",\"release_date\":\"2018-02-13\"},{\"vote_count\":4675,\"id\":284053,\"video\":false,\"vote_average\":7.4,\"title\":\"Thor: Ragnarok\",\"popularity\":220.584191,\"poster_path\":\"\\/oSLd5GYGsiGgzDPKTwQh7wamO8t.jpg\",\"original_language\":\"en\",\"original_title\":\"Thor: Ragnarok\",\"genre_ids\":[878,28,12,35,14],\"backdrop_path\":\"\\/kaIfm5ryEOwYg8mLbq8HkPuM1Fo.jpg\",\"adult\":false,\"overview\":\"Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the prophecy of destruction to his homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.\",\"release_date\":\"2017-10-25\"},{\"vote_count\":806,\"id\":337167,\"video\":true,\"vote_average\":6.3,\"title\":\"Fifty Shades Freed\",\"popularity\":204.508327,\"poster_path\":\"\\/jjPJ4s3DWZZvI4vw8Xfi4Vqa1Q8.jpg\",\"original_language\":\"en\",\"original_title\":\"Fifty Shades Freed\",\"genre_ids\":[18,10749],\"backdrop_path\":\"\\/9ywA15OAiwjSTvg3cBs9B7kOCBF.jpg\",\"adult\":false,\"overview\":\"Believing they have left behind shadowy figures from their past, newlyweds Christian and Ana fully embrace an inextricable connection and shared life of luxury. But just as she steps into her role as Mrs. Grey and he relaxes into an unfamiliar stability, new threats could jeopardize their happy ending before it even begins.\",\"release_date\":\"2018-02-07\"},{\"vote_count\":2886,\"id\":354912,\"video\":true,\"vote_average\":7.8,\"title\":\"Coco\",\"popularity\":159.104414,\"poster_path\":\"\\/eKi8dIrr8voobbaGzDpe8w0PVbC.jpg\",\"original_language\":\"en\",\"original_title\":\"Coco\",\"genre_ids\":[12,16,35,10751],\"backdrop_path\":\"\\/askg3SMvhqEl4OL52YuvdtY40Yb.jpg\",\"adult\":false,\"overview\":\"Despite his family’s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.\",\"release_date\":\"2017-10-27\"},{\"vote_count\":226,\"id\":401981,\"video\":false,\"vote_average\":6.6,\"title\":\"Red Sparrow\",\"popularity\":114.306944,\"poster_path\":\"\\/uZwnaMQTdwZz1kwtrrU3IOqxnDu.jpg\",\"original_language\":\"en\",\"original_title\":\"Red Sparrow\",\"genre_ids\":[9648,53],\"backdrop_path\":\"\\/sGzuQYSTwJvLBc2PnuSVLHhuFeh.jpg\",\"adult\":false,\"overview\":\"Prima ballerina Dominika Egorova faces a bleak and uncertain future after she suffers an injury that ends her career. She soon turns to Sparrow School, a secret intelligence service that trains exceptional young people to use their minds and bodies as weapons. Egorova emerges as the most dangerous Sparrow after completing the sadistic training process. As she comes to terms with her new abilities, Dominika meets a CIA agent who tries to convince her that he is the only person she can trust.\",\"release_date\":\"2018-03-01\"},{\"vote_count\":1966,\"id\":359940,\"video\":false,\"vote_average\":8.2,\"title\":\"Three Billboards Outside Ebbing, Missouri\",\"popularity\":112.194577,\"poster_path\":\"\\/vgvw6w1CtcFkuXXn004S5wQsHRl.jpg\",\"original_language\":\"en\",\"original_title\":\"Three Billboards Outside Ebbing, Missouri\",\"genre_ids\":[80,18],\"backdrop_path\":\"\\/bJLJAtGjBj836UjJZNOwgrfe5Ps.jpg\",\"adult\":false,\"overview\":\"After seven months have passed without a culprit in her daughter's murder case, Mildred Hayes makes a bold move, painting three signs leading into her town with a controversial message directed at Bill Willoughby, the town's revered chief of police. When his second-in-command Officer Jason Dixon, an immature mother's boy with a penchant for violence, gets involved, the battle between Mildred and Ebbing's law enforcement is only exacerbated.\",\"release_date\":\"2017-11-10\"},{\"vote_count\":1198,\"id\":391713,\"video\":false,\"vote_average\":7.6,\"title\":\"Lady Bird\",\"popularity\":68.394336,\"poster_path\":\"\\/vbvHTI7vfPKsONw75g9lio38SpN.jpg\",\"original_language\":\"en\",\"original_title\":\"Lady Bird\",\"genre_ids\":[35,18],\"backdrop_path\":\"\\/2ByWxoMbfE3pxztCJn5qTJ5Ui2Y.jpg\",\"adult\":false,\"overview\":\"A California high school student plans to escape from her family and small town by going to college in New York.\",\"release_date\":\"2017-09-08\"},{\"vote_count\":515,\"id\":353616,\"video\":false,\"vote_average\":6.5,\"title\":\"Pitch Perfect 3\",\"popularity\":63.552769,\"poster_path\":\"\\/fchHLsLjFvzAFSQykiMwdF1051.jpg\",\"original_language\":\"en\",\"original_title\":\"Pitch Perfect 3\",\"genre_ids\":[35,10402],\"backdrop_path\":\"\\/f5a9YRvJ7uSM0JAtEI59sqKRnVg.jpg\",\"adult\":false,\"overview\":\"After the highs of winning the world championships, the Bellas find themselves split apart and discovering there aren't job prospects for making music with your mouth. But when they get the chance to reunite for an overseas USO tour, this group of awesome nerds will come together to make some music, and some questionable decisions, one last time.\",\"release_date\":\"2017-12-21\"},{\"vote_count\":1125,\"id\":399404,\"video\":false,\"vote_average\":7.2,\"title\":\"Darkest Hour\",\"popularity\":59.975205,\"poster_path\":\"\\/xa6G3aKlysQeVg9wOb0dRcIGlWu.jpg\",\"original_language\":\"en\",\"original_title\":\"Darkest Hour\",\"genre_ids\":[18,36],\"backdrop_path\":\"\\/zXwFJMwvQcJFitP9GcHZvHAHGe8.jpg\",\"adult\":false,\"overview\":\"A thrilling and inspiring true story begins on the eve of World War II as, within days of becoming Prime Minister of Great Britain, Winston Churchill must face one of his most turbulent and defining trials: exploring a negotiated peace treaty with Nazi Germany, or standing firm to fight for the ideals, liberty and freedom of a nation. As the unstoppable Nazi forces roll across Western Europe and the threat of invasion is imminent, and with an unprepared public, a skeptical King, and his own party plotting against him, Churchill must withstand his darkest hour, rally a nation, and attempt to change the course of world history.\",\"release_date\":\"2017-11-22\"},{\"vote_count\":909,\"id\":336843,\"video\":false,\"vote_average\":7.3,\"title\":\"Maze Runner: The Death Cure\",\"popularity\":55.951953,\"poster_path\":\"\\/7GgZ6DGezkh3szFdvskH5XD4V0t.jpg\",\"original_language\":\"en\",\"original_title\":\"Maze Runner: The Death Cure\",\"genre_ids\":[28,9648,878,53,12,14],\"backdrop_path\":\"\\/bvbyidkMaBls1LTaIWYY6UmYTaL.jpg\",\"adult\":false,\"overview\":\"Thomas leads his group of escaped Gladers on their final and most dangerous mission yet. To save their friends, they must break into the legendary Last City, a WCKD-controlled labyrinth that may turn out to be the deadliest maze of all. Anyone who makes it out alive will get answers to the questions the Gladers have been asking since they first arrived in the maze.\",\"release_date\":\"2018-01-17\"},{\"vote_count\":1454,\"id\":398818,\"video\":false,\"vote_average\":8.3,\"title\":\"Call Me by Your Name\",\"popularity\":50.209586,\"poster_path\":\"\\/nPTjj6ZfBXXBwOhd7iUy6tyuKWt.jpg\",\"original_language\":\"en\",\"original_title\":\"Call Me by Your Name\",\"genre_ids\":[10749,18],\"backdrop_path\":\"\\/vABQeCuuagIjir0YBAfL0V2XePn.jpg\",\"adult\":false,\"overview\":\"Elio Perlman is spending the summer with his family at their vacation home in Lombardy, Italy. When his father hires a handsome doctoral student, the curious 17-year-old finds himself developing a growing attraction to the young man.\",\"release_date\":\"2017-10-27\"},{\"vote_count\":694,\"id\":389015,\"video\":false,\"vote_average\":7.5,\"title\":\"I, Tonya\",\"popularity\":49.486196,\"poster_path\":\"\\/6gNXwSHxaksR1PjVZRqNapmkgj3.jpg\",\"original_language\":\"en\",\"original_title\":\"I, Tonya\",\"genre_ids\":[18],\"backdrop_path\":\"\\/jDai0rdlBHhcY8vpJ4XmTIDQU5i.jpg\",\"adult\":false,\"overview\":\"Competitive ice skater Tonya Harding rises amongst the ranks at the U.S. Figure Skating Championships, but her future in the sport is thrown into doubt when her ex-husband intervenes.\",\"release_date\":\"2017-12-08\"},{\"vote_count\":1355,\"id\":406997,\"video\":false,\"vote_average\":8.2,\"title\":\"Wonder\",\"popularity\":47.280186,\"poster_path\":\"\\/ouYgAatYH4JzIThj6FI3UYf31RI.jpg\",\"original_language\":\"en\",\"original_title\":\"Wonder\",\"genre_ids\":[18],\"backdrop_path\":\"\\/4rsrxYDfIzvtAsIE9wevxPRXAk4.jpg\",\"adult\":false,\"overview\":\"The story of August Pullman – a boy with facial differences – who enters fifth grade, attending a mainstream elementary school for the first time.\",\"release_date\":\"2017-11-13\"},{\"vote_count\":12,\"id\":407451,\"video\":false,\"vote_average\":4.2,\"title\":\"A Wrinkle in Time\",\"popularity\":45.358223,\"poster_path\":\"\\/rSb6B7pwiZbW7In6juYEYjZ4Bsw.jpg\",\"original_language\":\"en\",\"original_title\":\"A Wrinkle in Time\",\"genre_ids\":[12,878,10751,14],\"backdrop_path\":\"\\/zqUaMojohr96itJYCE3W1NauTn7.jpg\",\"adult\":false,\"overview\":\"After the disappearance of her scientist father, three peculiar beings send Meg, her brother, and her friend to space in order to find him.\",\"release_date\":\"2018-03-08\"},{\"vote_count\":6864,\"id\":8587,\"video\":false,\"vote_average\":8.1,\"title\":\"The Lion King\",\"popularity\":44.478767,\"poster_path\":\"\\/bKPtXn9n4M4s8vvZrbw40mYsefB.jpg\",\"original_language\":\"en\",\"original_title\":\"The Lion King\",\"genre_ids\":[10751,16,18],\"backdrop_path\":\"\\/klI0K4oQMsLhHdjA9Uw8WLugk9v.jpg\",\"adult\":false,\"overview\":\"A young lion cub named Simba can't wait to be king. But his uncle craves the title for himself and will stop at nothing to get it.\",\"release_date\":\"1994-06-23\"},{\"vote_count\":1341,\"id\":316029,\"video\":false,\"vote_average\":8.1,\"title\":\"The Greatest Showman\",\"popularity\":43.256439,\"poster_path\":\"\\/dfhztJRiElqmYW4kpvjYe1gENsD.jpg\",\"original_language\":\"en\",\"original_title\":\"The Greatest Showman\",\"genre_ids\":[18,10402],\"backdrop_path\":\"\\/zpq404Sk7qQ7N4x3xOeNgp74GtU.jpg\",\"adult\":false,\"overview\":\"The story of American showman P.T. Barnum, founder of the circus that became the famous traveling Ringling Bros. and Barnum & Bailey Circus.\",\"release_date\":\"2017-12-20\"},{\"vote_count\":1633,\"id\":406990,\"video\":false,\"vote_average\":7.2,\"title\":\"What Happened to Monday\",\"popularity\":39.678783,\"poster_path\":\"\\/o6EsOqITcSzcdwD1zxBM9imdxjr.jpg\",\"original_language\":\"en\",\"original_title\":\"What Happened to Monday\",\"genre_ids\":[878,53],\"backdrop_path\":\"\\/wwZ2uXOwPkMrZSeFn9s7WFXEMg6.jpg\",\"adult\":false,\"overview\":\"In a world where families are limited to one child due to overpopulation, a set of identical septuplets must avoid being put to a long sleep by the government and dangerous infighting while investigating the disappearance of one of their own.\",\"release_date\":\"2017-08-18\"},{\"vote_count\":102,\"id\":445571,\"video\":false,\"vote_average\":7.5,\"title\":\"Game Night\",\"popularity\":38.55093,\"poster_path\":\"\\/1wS89vns6cseCn4UHSqj97xKEKW.jpg\",\"original_language\":\"en\",\"original_title\":\"Game Night\",\"genre_ids\":[9648,35,80,28],\"backdrop_path\":\"\\/jknYekTVH1n7doNVj5wiCMKhx7u.jpg\",\"adult\":false,\"overview\":\"A group of friends who meet regularly for game nights find themselves trying to solve a murder mystery.\",\"release_date\":\"2018-02-22\"},{\"vote_count\":7,\"id\":338970,\"video\":false,\"vote_average\":7,\"title\":\"Tomb Raider\",\"popularity\":37.351178,\"poster_path\":\"\\/fpeX7q6878v3Oo6uoQvKzBzK7Ls.jpg\",\"original_language\":\"en\",\"original_title\":\"Tomb Raider\",\"genre_ids\":[28,12,14],\"backdrop_path\":\"\\/xdPqNygbUXAdLfilrOSnrWoRwZd.jpg\",\"adult\":false,\"overview\":\"Lara Croft, the fiercely independent daughter of a missing adventurer, must push herself beyond her limits when she finds herself on the island where her father disappeared.\",\"release_date\":\"2018-03-14\"}],\"page\":1,\"total_results\":901,\"dates\":{\"maximum\":\"2018-03-15\",\"minimum\":\"2018-01-25\"},\"total_pages\":46}";


    }



    public static String getMessage(){
        return msgMovie;
    }
    public static String getTag() {return TAG;}
}
