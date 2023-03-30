import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-resultado_busqueda_hastag';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-busqueda_hastag__administrador_')
export class VistaBusqueda_hastag__administrador_ extends LitElement {
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
 <vista-cabecera__administrador_ style="width: 100%; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="width: 60%; height: 100%;">
   <vista-resultado_busqueda_hastag style="width: 100%; height: 100%;"></vista-resultado_busqueda_hastag>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 100%; justify-content: center; align-items: center;">
   <vaadin-text-field label="" placeholder="" style="width: 60%;"></vaadin-text-field>
   <vaadin-button style="width: 60%;">
    Buscar usuario
   </vaadin-button>
   <vaadin-button style="width: 60%;">
    Buscar hashtag
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
