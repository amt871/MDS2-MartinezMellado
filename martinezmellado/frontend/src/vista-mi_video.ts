import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
 <vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: center; align-items: center; align-self: center;">
  <vista-mi_video_item id="item1"></vista-mi_video_item>
  <vista-mi_video_item id="item2"></vista-mi_video_item>
  <vista-mi_video_item id="item3"></vista-mi_video_item>
  <vista-mi_video_item id="item4"></vista-mi_video_item>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
