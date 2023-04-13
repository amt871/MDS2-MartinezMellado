import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-video_otro_usuario__administrador__item';

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
 <vista-cabecera__administrador_ style="flex-grow: 0; width: 100%; height: 5%;" id="cabecera"></vista-cabecera__administrador_>
 <vaadin-vertical-layout style="width: 100%; height: 95%; flex-direction: row; align-self: center; align-items: center; justify-content: center;">
  <vaadin-scroller style="width: 100%; height: 100%;" id="scroller">
   <vista-video_otro_usuario__administrador__item></vista-video_otro_usuario__administrador__item>
   <vista-video_otro_usuario__administrador__item></vista-video_otro_usuario__administrador__item>
   <vista-video_otro_usuario__administrador__item></vista-video_otro_usuario__administrador__item>
  </vaadin-scroller>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
