import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-videos_hashtag__no_registrado_')
export class VistaVideos_hashtag__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; position: absolute;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-vertical-layout style="width: 100%; height: 95%;">
  <vaadin-horizontal-layout style="align-items: center; justify-content: center; width: 100%; height: 5%;">
   <label id="labelHashtag">HashTag</label>
  </vaadin-horizontal-layout>
  <div style="width: 100%; height: 95%;">
   <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
  </div>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
