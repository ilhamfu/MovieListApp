package com.bismus.dicodingsubmission2.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.bismus.dicodingsubmission2.model.MovieItem
import com.bismus.dicodingsubmission2.R
import com.bismus.dicodingsubmission2.activity.MovieDetailActivity
import com.bismus.dicodingsubmission2.rv_adapter.MovieListAdapter
import kotlinx.android.synthetic.main.fragment_movie_list.*

class MovieListFragment : Fragment() {

    val movieImage:Array<MovieItem> = arrayOf(
        MovieItem("Alita: Battle Angel",
            2019,
            7.3,
            "Alita, a battle cyborg, is revived by Ido, a doctor, who realises that she actually has the soul of a teenager. Alita then sets out to learn about her past and find her true identity.",
            R.drawable.poster_alita),

        MovieItem("Aquaman",
            2018,
            7.0,
            "Half-human, half-Atlantean Arthur is born with the ability to communicate with marine creatures. He goes on a quest to retrieve the legendary Trident of Atlan and protect the water world.",
            R.drawable.poster_aquaman),

        MovieItem("A Star Is Born",
            2018,
            7.7,
            "After falling in love with struggling artist Ally, Jackson, a musician, coaxes her to follow her dreams, while he battles with alcoholism and his personal demons.",
            R.drawable.poster_a_start_is_born),

        MovieItem("Bohemian Rhapsody",
            2018,
            8.0,
            "Queen, a British rock band, sets out to achieve musical superstardom. At the same time, lead singer Freddie Mercury faces personal struggles pertaining to his ego and sexuality.",
            R.drawable.poster_bohemian),

        MovieItem("Cold Pursuit",
            2019,
            6.2,
            "Nels Coxman, a snowplow driver, celebrates his 'Citizen of the Year' award. However, his life turns upside down when his son dies due to a forced heroin overdose.",
            R.drawable.poster_cold_persuit),

        MovieItem("Creed II",
            2018,
            7.1,
            "In 1985, Russian boxer Ivan Drago killed former U.S. champion Apollo Creed in a tragic match that stunned the world. Against the wishes of trainer Rocky Balboa, Apollo's son Adonis Johnson accepts a challenge from Drago's son -- another dangerous fighter. Under guidance from Rocky, Adonis trains for the showdown of his life -- a date with destiny that soon becomes his obsession. Now, Johnson and Balboa must confront their shared legacy as the past comes back to haunt each man.",
            R.drawable.poster_creed),

        MovieItem("Fantastic Beasts: The Crimes of Grindelwald",
            2018,
            6.6,
            "Gellert Grindelwald plans to raise an army of wizards to rule over non-magical beings. In response, Newt Scamander's former professor, Albus Dumbledore, seeks his help to stop him.",
            R.drawable.poster_crimes),

        MovieItem("Glass",
            2019,
            6.7,
            "David Dunn tries to stay one step ahead of the law while delivering vigilante justice on the streets of Philadelphia. His special talents soon put him on a collision course with the Beast -- the psychotic madman who has superhuman strength and 23 distinct personalities. Their epic showdown leads them to an encounter with the mysterious Elijah Price, the criminal mastermind who holds critical secrets for both men.",
            R.drawable.poster_glass),

        MovieItem("How to Train Your Dragon: The Hidden World",
            2019,
            7.5,
            "Hiccup aims to unite the vikings and the dragons in order to bring peace on the island of Berk. However, he must stop the evil Grimmel and his devious plans to wipe out all dragons.",
            R.drawable.poster_how_to_train),

        MovieItem("Avengers: Infinity War",
            2018,
            8.5,
            "The Avengers must stop Thanos, an intergalactic warlord, from getting his hands on all the infinity stones. However, Thanos is prepared to go to any lengths to carry out his insane plan.",
            R.drawable.poster_infinity_war),

        MovieItem("Mary Queen of Scots",
            2018,
            6.3,
            "Mary Stuart returns to Scotland in order to claim her rightful throne. She attempts to overthrow her cousin Elizabeth I, Queen of England, but finds herself condemned to years of imprisonment.",
            R.drawable.poster_marry_queen),

        MovieItem("Master Z: The Ip Man Legacy",
            2018,
            6.5,
            "Defeated by Master Ip, martial arts expert Cheung Tin Chi tries to lead a normal life in Hong Kong until triad leaders draw him back into fighting.",
            R.drawable.poster_master_z),

        MovieItem("Mortal Engines",
            2018,
            6.1,
            "Hundreds of years after a cataclysmic event destroyed civilization, mysterious young Hester Shaw emerges as the only one who can stop the city of London -- now a giant predator on wheels -- from devouring everything in its path. Feral and fiercely driven by the memory of her mother, Hester joins forces with Tom Natsworthy, an outcast from London, and Anna Fang, a dangerous outlaw with a bounty on her head.",
            R.drawable.poster_mortal_engines),

        MovieItem("Overlord",
            2018,
            6.6,
            "After a group of American paratroopers is attacked by the Nazis in a French town, its survivors aim to get the town and complete their mission of destroying a radio tower.",
            R.drawable.poster_overlord),

        MovieItem("Ralph Breaks the Internet",
            2018,
            7.1,
            "Ralph and his best friend, Vanellope, face various challenges as they visit the uncharted land of the Internet through a Wi-Fi router at the arcade to save the game, Sugar Rush.",
            R.drawable.poster_ralph),

        MovieItem("Robin Hood",
            2018,
            5.3,
            "After returning home to England, aristocrat Robin of Loxley learns that the evil Sheriff of Nottingham has seized his family estate. He soon joins forces with Friar Tuck and Little John -- a fierce Arabian warrior who wants to put an end to the Crusades. Armed with arrows and dubbed Robin Hood, Loxley leads a band of oppressed rebels in a daring plan to rob the Sheriff of his money and take away his power.",
            R.drawable.poster_robin_hood),

        MovieItem("Serenity",
            2019,
            5.3,
            "Baker Dill enjoys his tranquil life in Plymouth Island. However, his life turns upside down when his ex-wife, Karen, tracks him down and offers him $10 million to get rid of her abusive new husband.",
            R.drawable.poster_serenity),

        MovieItem("Spider-Man: Into the Spider-Verse",
            2018,
            8.4,
            "After gaining superpowers from a spider bite, Miles Morales protects the city as Spider-Man. Soon, he meets alternate versions of himself and gets embroiled in an epic battle to save the multiverse.",
            R.drawable.poster_spiderman),

        MovieItem("T-34",
            2019,
            6.5,
            "In 1944 a group of Russian soldiers escapes from German captivity in a half-destroyed tank.",
            R.drawable.poster_t34)
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_movie_list,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_movie_list.apply{
            layoutManager= LinearLayoutManager(activity)
            adapter = MovieListAdapter(movieImage) { movie:MovieItem->MovieClicked(movie)}
        }
    }

    private fun MovieClicked(movie: MovieItem) {
        Toast.makeText(context,movie.title,Toast.LENGTH_LONG).show()
        val intent = Intent(context,MovieDetailActivity::class.java)
        intent.putExtra(MovieDetailActivity.MOVIE_DATA,movie)
        startActivity(intent)
    }
}
