package de.westnordost.streetcomplete.quests.tactile_paving

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.quests.AbstractOsmQuestAnswerForm
import de.westnordost.streetcomplete.quests.AnswerItem

class TactilePavingForm : AbstractOsmQuestAnswerForm<Boolean>() {

    override val contentLayoutResId = R.layout.quest_tactile_paving

    override val buttonPanelAnswers = listOf(
        AnswerItem(R.string.quest_generic_hasFeature_no) { applyAnswer(false) },
        AnswerItem(R.string.quest_generic_hasFeature_yes) { applyAnswer(true) }
    )
}
