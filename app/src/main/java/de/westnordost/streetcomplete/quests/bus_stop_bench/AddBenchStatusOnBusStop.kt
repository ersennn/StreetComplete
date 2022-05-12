package de.westnordost.streetcomplete.quests.bus_stop_bench

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.data.osm.osmquests.OsmFilterQuestType
import de.westnordost.streetcomplete.data.osm.osmquests.Tags
import de.westnordost.streetcomplete.data.user.achievements.EditTypeAchievement.PEDESTRIAN
import de.westnordost.streetcomplete.osm.updateWithCheckDate
import de.westnordost.streetcomplete.quests.YesNoQuestAnswerForm
import de.westnordost.streetcomplete.util.ktx.toYesNo

class AddBenchStatusOnBusStop : OsmFilterQuestType<Boolean>() {

    override val elementFilter = """
        nodes with
        (
          (public_transport = platform and ~bus|trolleybus|tram ~ yes)
          or
          (highway = bus_stop and public_transport != stop_position)
        )
        and physically_present != no and naptan:BusStopType != HAR
        and (!bench or bench older today -4 years)
    """
    override val changesetComment = "Add whether a bus stop has a bench"
    override val wikiLink = "Key:bench"
    override val icon = R.drawable.ic_quest_bench_public_transport
    override val achievements = listOf(PEDESTRIAN)

    override fun getTitle(tags: Map<String, String>) = R.string.quest_busStopBench_title2

    override fun createForm() = YesNoQuestAnswerForm()

    override fun applyAnswerTo(answer: Boolean, tags: Tags, timestampEdited: Long) {
        tags.updateWithCheckDate("bench", answer.toYesNo())
    }
}
