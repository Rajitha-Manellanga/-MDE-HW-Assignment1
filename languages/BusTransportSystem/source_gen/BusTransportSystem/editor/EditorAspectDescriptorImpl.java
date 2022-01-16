package BusTransportSystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Booking_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Bus_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new City_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Passenger_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Seat_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea79L), MetaIdFactory.conceptId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3e54ebL), MetaIdFactory.conceptId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed84dL), MetaIdFactory.conceptId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea93L), MetaIdFactory.conceptId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed848L)).seal();
}