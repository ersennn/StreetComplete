package de.westnordost.streetcomplete.quests.existence

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.quests.AbstractOsmQuestAnswerForm
import de.westnordost.streetcomplete.quests.AnswerItem

class CheckExistenceForm : AbstractOsmQuestAnswerForm<Unit>() {

    override val buttonPanelAnswers = listOf(
        AnswerItem(R.string.quest_generic_hasFeature_no) { deletePoiNode() },
        AnswerItem(R.string.quest_generic_hasFeature_yes) { applyAnswer(Unit) }
    )
}
