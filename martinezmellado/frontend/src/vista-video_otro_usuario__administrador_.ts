import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-video_otro_usuario__administrador_')
export class VistaVideo_otro_usuario__administrador_ extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-horizontal-layout style="width: 100%; height: 870px; flex-shrink: 0; flex-direction: column;">
  <div id="divScroller" style="width: 100%; height: 100%; flex-shrink: 1; flex-grow: 0; align-self: stretch;"></div>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
