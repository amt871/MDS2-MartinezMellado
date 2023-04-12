import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-mi_video_item';

@customElement('vista-mi_video')
export class VistaMi_video extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-scroller style="width: 100%; height: 100%; align-self: center;">
  <vaadin-horizontal-layout style="width: 100%; height: 50%; justify-content: space-around;">
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; justify-content: space-around;">
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; justify-content: space-around;">
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
   <vista-mi_video_item></vista-mi_video_item>
  </vaadin-horizontal-layout>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
