package com.bismus.dicodingsubmission2.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.bismus.dicodingsubmission2.R
import com.bismus.dicodingsubmission2.activity.MovieDetailActivity
import com.bismus.dicodingsubmission2.activity.TvShowDetailActivity
import com.bismus.dicodingsubmission2.model.MovieItem
import com.bismus.dicodingsubmission2.model.TvShowItem
import com.bismus.dicodingsubmission2.rv_adapter.TvShowListAdapter
import kotlinx.android.synthetic.main.fragment_tv_show.*

class TvShowFragment : Fragment() {

    val tvShows:Array<TvShowItem> = arrayOf(TvShowItem("Arrow",
        7.6,
        "After mastering the skill of archery on a deserted island, multi-millionaire playboy Oliver Queen returns to his city to take on the vigilante persona of Arrow to fight crime and corruption.",
        "October 10, 2012",
        170,
        R.drawable.poster_arrow),

        TvShowItem("Doom Patrol",
            8.0,
            "Doom Patrol is a team of traumatized and downtrodden superheroes, each of whom has suffered a horrible accident that gave them superhuman abilities but also left them scarred and disfigured. The members of the team have found their purpose through The Chief and have come together to investigate some of the world's weirdest phenomena. After The Chief mysteriously disappears, though, the reluctant heroes find themselves called to action by Cyborg, who comes to them with a mission that they cannot refuse. Doom Patrol -- part support group, part superhero team -- is a band of superpowered freaks fighting for a world that wants nothing to do with them.",
            "February 15, 2019",
            15,
            R.drawable.poster_doom_patrol),

        TvShowItem("Dragon Ball",
            8.5,
            "Dragon Ball is a Japanese media franchise created by Akira Toriyama in 1984. The initial manga, written and illustrated by Toriyama, was serialized in Weekly Shōnen Jump from 1984 to 1995, with the 519 individual chapters collected into 42 tankōbon volumes by its publisher Shueisha.",
            "February 26, 1986",
            153,
            R.drawable.poster_dragon_ball),

        TvShowItem("Fairy Tail",
            8.0,
            "Lucy, a travelling mage, gets saved by Natsu from the clutches of the evil Bora. Later, along with other members, she embarks on various missions.",
            "October 12, 2009",
            328,
            R.drawable.poster_fairytail),

        TvShowItem("Family Guy",
            8.1,
            "Peter Griffin and his family of two teenagers, a smart dog, a devilish baby and his wife find themselves in some of the most hilarious scenarios.",
            "January 31, 1999",
            339,
            R.drawable.poster_family_guy),

        TvShowItem("The Flash",
            7.8,
            "Barry Allen, a forensic scientist with the Central City police force, is struck by lightning in a freak accident. When he wakes up after nine months, he discovers that he can achieve great speeds.",
            "October 7, 2014",
            126,
            R.drawable.poster_flash),

        TvShowItem("Game of Thrones",
            9.3,
            "Nine noble families wage war against each other in order to gain control over the mythical land of Westeros. Meanwhile, a force is rising after millenniums and threatens the existence of living men.",
            "April 17, 2011",
            73,
            R.drawable.poster_god),

        TvShowItem("Gotham",
            7.8,
            "Detective James Gordon is a new recruit assigned to investigate the murder of Thomas and Martha Wayne. The case acquaints him with the slain couple's son and future crusader, Bruce.",
            "September 22, 2014",
            100,
            R.drawable.poster_gotham),

        TvShowItem("Grey's Anatomy",
            7.6,
            "Surgical interns and their supervisors embark on a medical journey where they become part of heart-wrenching stories and make life-changing decisions in order to become the finest doctors.",
            "March 27, 2005",
            355,
            R.drawable.poster_grey_anatomy),

        TvShowItem("Hanna",
            7.5,
            "Hanna is an extraordinary girl who has been raised in the forest, evading the relentless pursuit of an off-the-book CIA agent. This series -- part high-concept thriller, part coming-of-age drama -- follows the girl on her journey as she tries to unearth the truth behind who she is. \"Hanna\" is based on the 2011 film of the same name that starred Oscar-nominated actress Saoirse Ronan in the title role.",
            "February 3, 2019",
            8,
            R.drawable.poster_hanna),

        TvShowItem("Iron Fist",
            6.5,
            "When Danny Rand was 10-years old, he survived a mysterious plane crash that claimed the lives of his extremely wealthy parents. Rescued by warrior monks, Danny grew up in the of city of K'un-Lun, where he endured harsh conditions, but also trained to be a fierce warrior. Years later, Danny returns home to New York, where he wants to reconnect with his past and take his rightful place at his family's company, which is being run by his father's former business partner. Danny hopes to restore his family legacy by defeating the people who threaten it.",
            "March 17, 2017",
            23,
            R.drawable.poster_iron_fist),

        TvShowItem("Naruto Shippūden (Naruto Shippuden)",
            8.5,
            "More than two years have passed since the most recent adventures in the Hidden Leaf Village, ample time for ninja wannabe Naruto Uzumaki to have developed skills worthy of recognition and respect. The hyperactive youngster has trained extensively with Jiraiya-sama and returned to Konoha to reunite with friends and, perhaps, partake in more pranks than schoolwork. But Naruto is more determined than ever to become the greatest ninja, and his hard-earned improvements are put to the ultimate test against newer, stronger enemies. \"Naruto: Shippuden\" is adapted from Part II of the \"Naruto\" comic book series by Masashi Kishimoto.",
            "February 15, 2007",
            500,
            R.drawable.poster_naruto_shipudden),

        TvShowItem("NCIS",
            7.8,
            "Special Agent Leroy Jethro Gibbs is a skilled investigator. He leads a team of agents of the Naval Criminal Investigative Service's Major Case Response Team as they solve intense criminal cases.",
            "September 23, 2003",
            394,
            R.drawable.poster_ncis),

        TvShowItem("Riverdale",
            7.1,
            "DescriptionArchie, Betty, Jughead and Veronica tackle being teenagers in a town that is rife with sinister happenings and blood-thirsty criminals.",
            "January 26, 2017",
            71,
            R.drawable.poster_riverdale),
        TvShowItem("Shameless",
            8.6,
            "Frank Gallagher is the head of a working-class family in Chicago. His six children suffer because he is a heavy drinker and Fiona, the eldest daughter, has to look after everyone in the house.",
            "January 9, 2011",
            122,
            R.drawable.poster_shameless),

        TvShowItem("Supergirl",
            6.3,
            "Kara Danvers who is Superman's biological cousin is forced to unveil her hidden powers and protect the inhabitants when an unexpected disaster strikes National City.",
            "July 8, 2015",
            99,
            R.drawable.poster_supergirl),

        TvShowItem("Supernatural",
            8.4,
            "DescriptionBrothers Dean and Sam follow in their father's footsteps and set out to eliminate monsters, demons and other supernatural entities that exist on Earth.",
            "September 13, 2005",
            318,
            R.drawable.poster_supernatural),

        TvShowItem("The Simpsons",
            8.7,
            "Working-class father Homer Simpson and his dysfunctional family deal with comical situations and the ups-and-downs of life in the town of Springfield.",
            "December 17, 1989",
            674,
            R.drawable.poster_the_simpson),

        TvShowItem("The Umbrella Academy",
            8.0,
            "On one day in 1989, 43 infants are inexplicably born to random, unconnected women who showed no signs of pregnancy the day before. Seven are adopted by billionaire industrialist Sir Reginald Hargreeves, who creates the Umbrella Academy and prepares his \"children\" to save the world. In their teenage years, though, the family fractures and the team disbands. Fast forward to the present time, when the six surviving members of the clan reunite upon the news of Hargreeves' passing. They work together to solve a mystery surrounding their father's death, but divergent personalities and abilities again pull the estranged family apart, and a global apocalypse is another imminent threat. The series is based on a collection of comics and graphic novels created and written by My Chemical Romance lead singer Gerard Way.",
            "February 15, 2019",
            10,
            R.drawable.poster_the_umbrella),

        TvShowItem("The Walking Dead",
            8.2,
            "A group of survivors led by police officer Rick Grimes travel in search of a safe and secure home after a zombie apocalypse spreads across the USA.",
            "October 31, 2010",
            139,
            R.drawable.poster_the_walking_dead))

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_tv_show,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_tv_show_list.apply{
            layoutManager= LinearLayoutManager(activity)
            adapter = TvShowListAdapter(tvShows){tvShowItem: TvShowItem -> tvShowListener(tvShowItem) }
        }
    }

    private fun tvShowListener(tvShow:TvShowItem) {
        val intent = Intent(context, TvShowDetailActivity::class.java)
        intent.putExtra(TvShowDetailActivity.TV_SHOW_DATA,tvShow)
        startActivity(intent)
    }
}
