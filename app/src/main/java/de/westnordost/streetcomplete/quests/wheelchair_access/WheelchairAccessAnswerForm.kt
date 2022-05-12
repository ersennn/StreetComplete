package de.westnordost.streetcomplete.quests.wheelchair_access

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.quests.AbstractOsmQuestAnswerForm
import de.westnordost.streetcomplete.quests.AnswerItem
import de.westnordost.streetcomplete.quests.wheelchair_access.WheelchairAccess.LIMITED
import de.westnordost.streetcomplete.quests.wheelchair_access.WheelchairAccess.NO
import de.westnordost.streetcomplete.quests.wheelchair_access.WheelchairAccess.YES

open class WheelchairAccessAnswerForm : AbstractOsmQuestAnswerForm<WheelchairAccess>() {

    override val buttonPanelAnswers = listOf(
        AnswerItem(R.string.quest_generic_hasFeature_no) { applyAnswer(NO) },
        AnswerItem(R.string.quest_generic_hasFeature_yes) { applyAnswer(YES) },
        AnswerItem(R.string.quest_wheelchairAccess_limited) { applyAnswer(LIMITED) },
    )
}
